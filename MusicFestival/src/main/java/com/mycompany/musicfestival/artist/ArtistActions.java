
package main.java.com.mycompany.musicfestival.artist;

import java.util.List;
//xaraktiristika pou mporei na kanei o artist
public interface ArtistActions {
    void applyForFestival(String festivalName);
    void viewFestivalDetails(String festivalName);
    void viewApprovedFestivals(List<String> approvedFestivals);
}
