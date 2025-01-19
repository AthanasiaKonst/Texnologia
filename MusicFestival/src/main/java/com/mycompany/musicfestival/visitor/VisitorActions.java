
package main.java.com.mycompany.musicfestival.visitor;

import java.util.List;
import java.util.Map;

public interface VisitorActions {
      void viewProgram();
    void buyTicket(String festivalName);
    void rateFestival(String festivalName, int rating);
    void viewApprovedFestivals(List<String> approvedFestivals);
void viewFestivalPerformances(Map<String, List<String>> festivalPerformances, String festivalName);

}
