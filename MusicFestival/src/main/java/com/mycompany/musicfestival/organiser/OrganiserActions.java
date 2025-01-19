package main.java.com.mycompany.musicfestival.organiser;

import java.util.List;

public interface OrganiserActions {
    void createFestival(String name, String location, String date);
    void acceptArtist(String artistName);
     void viewArtistApplications(List<String> artistApplications);
}
