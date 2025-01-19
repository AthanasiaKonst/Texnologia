
package main.java.com.mycompany.musicfestival.menu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import main.java.com.mycompany.musicfestival.User;
import main.java.com.mycompany.musicfestival.artist.Artist;
import main.java.com.mycompany.musicfestival.organiser.Organiser;
import main.java.com.mycompany.musicfestival.stuff.Staff;
import main.java.com.mycompany.musicfestival.visitor.Visitor;
public class Menu {
   
   public void showMainMenu() {  //emfanizei to menu
    Scanner scanner = new Scanner(System.in); //scaner gia thn epilogh tou paixti
    User user = null;  //dimiourgia tou user
    boolean exit = false;  //dimiourgia asfalis metablhthw boolian gia ton elenxo tou sisthmatos
 
    List<String> approvedFestivals = Arrays.asList("Festival A", "Festival B", "Festival C"); //dimiourgia listas ton festival pou exoun ginei apoekta
    List<String> artistApplications = Arrays.asList("Artist 1", "Artist 2", "Artist 3"); //dimiourgia kalhtexnon pou exoun kanei etoish gia to festival
    List<String> artists = Arrays.asList("Artist 1", "Artist 2", "Artist 3"); //dimiourgia kalitexnon pou oi etoiseis tous exoun ginei apodextes
    List<String> festivals = Arrays.asList("Festival A", "Festival B", "Festival C");  //dimiourgia listas ton festival

    while (user == null) { //o user epilegei ton rolo tou 
        System.out.println("Select role:");
        System.out.println("1. Visitor");
        System.out.println("2. Organiser");
        System.out.println("3. Artist");
        System.out.println("4. Staff");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();//gia ton buffer
//bash tou rolou dimiourgitai ena neo antikeimeno sthn eksthote klash
        switch (choice) {
            case 1:
                user = new Visitor("John Doe", 101);   
                break;
            case 2:
                user = new Organiser("Alice");
                break;
            case 3:
                user = new Artist("Band X");
                break;
            case 4:
                user = new Staff("Mike", 201);
                break;
            case 0:
    exit = true;
    System.out.println("Logging out...");
    System.exit(0);
    break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    user.login();
//dimiourgia kai klhsh toy antistixou menu tou antikimenou
    if (user instanceof Visitor) {
    Visitor visitor = (Visitor) user;  
    showVisitorMenu(visitor, approvedFestivals, new HashMap<>());
} else if (user instanceof Organiser) {
    Organiser organiser = (Organiser) user;
    showOrganiserMenu(organiser, artistApplications);
} else if (user instanceof Artist) {
    Artist artist = (Artist) user;
    showArtistMenu(artist, approvedFestivals);
} else if (user instanceof Staff) {
    Staff staff = (Staff) user;
    showStaffMenu(staff, festivals, artists);
}
    user.logout();
}
   //dimiourgia tou visitor vasi tou lorou tou visitor
   private void showVisitorMenu(Visitor visitor, List<String> approvedFestivals, Map<String, List<String>> festivalPerformances) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("Visitor Menu:");
        System.out.println("1. View Program"); 
        System.out.println("2. Buy Ticket");
        System.out.println("3. Rate Festival");
        System.out.println("4. View Approved Festivals");
        System.out.println("5. View Performances of a Festival");
        System.out.println("0. Logout");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                visitor.viewProgram(); //an epilexei to proto kalei thn sunartish gia na dei to programma tou festival
                break;
            case 2:
                System.out.println("Enter festival name:"); 
                String festivalName = scanner.nextLine();
                visitor.buyTicket(festivalName);
                break;
            case 3:
                System.out.println("Enter festival name:");
                String festivalNameRate = scanner.nextLine();
                System.out.println("Enter rating (1-5):");
                int rating = scanner.nextInt();
                visitor.rateFestival(festivalNameRate, rating);
                break;
            case 4:
                visitor.viewApprovedFestivals(approvedFestivals);
                break;
            case 5:
                System.out.println("Enter festival name:");
                String festivalNameDetails = scanner.nextLine();
                visitor.viewFestivalPerformances(festivalPerformances, festivalNameDetails);
                break;
            case 0:
                //exit = true;
                System.out.println("Logging out...");
                showMainMenu();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}
   
   
   private void showOrganiserMenu(Organiser organiser, List<String> artistApplications) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("Organiser Menu:");
        System.out.println("1. Create Festival");
        System.out.println("2. Accept Artist Application");
        System.out.println("3. View Artist Applications");
        System.out.println("0. Logout");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.println("Enter festival name:");
                String festivalName = scanner.nextLine();
                System.out.println("Enter location:");
                String location = scanner.nextLine();
                System.out.println("Enter date:");
                String date = scanner.nextLine();
                organiser.createFestival(festivalName, location, date);
                break;
            case 2:
                System.out.println("Enter artist name to accept:");
                String artistName = scanner.nextLine();
                organiser.acceptArtist(artistName);
                break;
            case 3:
                organiser.viewArtistApplications(artistApplications);
                break;
            case 0:
                //exit = true;
                System.out.println("Logging out...");
                showMainMenu();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}
   
   private void showArtistMenu(Artist artist, List<String> approvedFestivals) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("Artist Menu:");
        System.out.println("1. Apply for Festival");
        System.out.println("2. View Festival Details");
        System.out.println("3. View Approved Festivals");
        System.out.println("0. Logout");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter festival name to apply:");
                String festivalName = scanner.nextLine();
                artist.applyForFestival(festivalName);
                break;
            case 2:
                System.out.println("Enter festival name to view details:");
                String festivalDetails = scanner.nextLine();
                artist.viewFestivalDetails(festivalDetails);
                break;
            case 3:
                artist.viewApprovedFestivals(approvedFestivals);
                break;
            case 0:
                //exit = true;
                System.out.println("Logging out...");
                showMainMenu();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}

private void showStaffMenu(Staff staff, List<String> festivals, List<String> artists) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("Staff Menu:");
        System.out.println("1. View Performance Details");
        System.out.println("2. Rate Festival");
        System.out.println("3. View Role in Festival");
        System.out.println("4. Rate Artist");
        System.out.println("0. Logout");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter festival name to view performance details:");
                String festivalName = scanner.nextLine();
                staff.viewPerformanceDetails(festivalName);
                break;
            case 2:
                System.out.println("Enter festival name to rate:");
                String festivalToRate = scanner.nextLine();
                System.out.println("Enter rating (1-5):");
                int festivalRating = scanner.nextInt();
                scanner.nextLine(); // Καθαρισμός buffer
                staff.rateFestival(festivalToRate, festivalRating);
                break;
            case 3:
                System.out.println("Enter festival name to view your role:");
                String roleFestival = scanner.nextLine();
                staff.viewRoleInFestival(roleFestival);
                break;
            case 4:
                System.out.println("Enter artist name to rate:");
                String artistToRate = scanner.nextLine();
                System.out.println("Enter rating (1-5):");
                int artistRating = scanner.nextInt();
                scanner.nextLine();
                staff.rateArtist(artistToRate, artistRating);
                break;
            case 0:
                //exit = true;
                System.out.println("Logging out...");
                showMainMenu();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}


}
