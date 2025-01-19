
package main.java.com.mycompany.musicfestival.visitor;

import java.util.List;
import java.util.Map;
import main.java.com.mycompany.musicfestival.User;

public class Visitor implements User, VisitorActions {
    private String name;
    private int visitorId;

    public Visitor(String name, int visitorId) {
        this.name = name;
        this.visitorId = visitorId;
    }

    @Override
    public void login() {
        System.out.println("Visitor " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Visitor " + name + " logged out.");
    }

    @Override
    public void viewProgram() {
        System.out.println("Viewing festival program...");
    }

    @Override
    public void buyTicket(String festivalName) {
        System.out.println("Buying ticket for " + festivalName);
    }

    @Override
    public void rateFestival(String festivalName, int rating) {
        System.out.println("Rating festival " + festivalName + " with " + rating + " stars.");
    }
    @Override
public void viewApprovedFestivals(List<String> approvedFestivals) {
    System.out.println("Approved Festivals:");
    for (String festival : approvedFestivals) {
        System.out.println("- " + festival);
    }
}

@Override
public void viewFestivalPerformances(Map<String, List<String>> festivalPerformances, String festivalName) {
    if (festivalPerformances.containsKey(festivalName)) {
        System.out.println("Performances for " + festivalName + ":");
        for (String performance : festivalPerformances.get(festivalName)) {
            System.out.println("- " + performance);
        }
    } else {
        System.out.println("No performances found for festival: " + festivalName);
    }
}

}