
package main.java.com.mycompany.musicfestival.stuff;

public interface StaffActions {
    void viewPerformanceDetails(String festivalName);
    void rateFestival(String festivalName, int rating);
    void viewAssignedTasks();
    void viewRoleInFestival(String festivalName);
    void rateArtist(String artistName, int rating);
}
