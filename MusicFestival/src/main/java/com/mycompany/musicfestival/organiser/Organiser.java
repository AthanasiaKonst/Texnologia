
package main.java.com.mycompany.musicfestival.organiser;

import java.util.List;
import main.java.com.mycompany.musicfestival.User;
import main.java.com.mycompany.musicfestival.artist.Artist;

public class Organiser implements User, OrganiserActions {
    private String name;

    public Organiser(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println("Organiser " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Organiser " + name + " logged out.");
    }

    @Override
    public void createFestival(String name, String location, String date) {
        System.out.println("Festival " + name + " created at " + location + " on " + date);
    }

    @Override
    public void acceptArtist(String artistName) {
        System.out.println("Artist " + artistName + " accepted for the festival.");
    }
    @Override
public void viewArtistApplications(List<String> artistApplications) {
    System.out.println("Artist Applications:");
    for (String artist : artistApplications) {
        System.out.println("- " + artist);
    }
}

}

