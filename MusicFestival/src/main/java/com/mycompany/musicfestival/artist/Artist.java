
package main.java.com.mycompany.musicfestival.artist;
import java.util.List;
import main.java.com.mycompany.musicfestival.User;

public class Artist implements User, ArtistActions {  //kleironomh apo to intrface tou artist kai tou user kai ths kaloi
    private String name;

    public Artist(String name) {
        this.name = name;  //to onoma apo to interface ginetai h metavlith name
    }

    @Override
    public void login() {
        System.out.println("Artist " + name + " logged in.");   //login apo user interface
    }

    @Override
    public void logout() {
        System.out.println("Artist " + name + " logged out.");
    }

    @Override
    public void applyForFestival(String festivalName) {
        System.out.println("Applying for festival " + festivalName);  //to festival pou tha exei o xrisths
    }

    @Override
    public void viewFestivalDetails(String festivalName) {
        System.out.println("Viewing details for festival " + festivalName);   //dixnei ths leptomeries gia to festival
    }
    @Override
public void viewApprovedFestivals(List<String> approvedFestivals) {
    System.out.println("Approved Festivals:");
    for (String festival : approvedFestivals) {   //o artist ginetai apodektos sto festival
        System.out.println("- " + festival);
    }
}

}
