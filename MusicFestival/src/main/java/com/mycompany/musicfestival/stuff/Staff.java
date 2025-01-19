
package main.java.com.mycompany.musicfestival.stuff;

import main.java.com.mycompany.musicfestival.User;

public class Staff implements User, StaffActions {
    private String name;
    private int staffId;

    public Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    @Override
    public void login() {
        System.out.println("Staff " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Staff " + name + " logged out.");
    }

    @Override
    public void viewPerformanceDetails(String festivalName) {
        System.out.println("Viewing performance details for " + festivalName);
    }

    @Override
    public void rateFestival(String festivalName, int rating) {
        System.out.println("Staff rating festival " + festivalName + " with " + rating + " stars.");
    }

    @Override
    public void viewAssignedTasks() {
        System.out.println("Viewing assigned tasks...");
    }
    @Override
public void viewRoleInFestival(String festivalName) {
    System.out.println("Role in festival " + festivalName + ": Security Coordinator");
}

@Override
public void rateArtist(String artistName, int rating) {
    System.out.println("Rating artist " + artistName + " with " + rating + " stars.");
}

}