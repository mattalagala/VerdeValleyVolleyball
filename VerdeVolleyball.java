// import java.util.Currency;
import java.util.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Comparator;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
// import java.io.FileOutputStream;
// import java.io.PrintWriter;
// import java.io.IOException;
// import java.util.Arrays;
// import java.io.FileNotFoundException;
import java.lang.String;

class Player {
        
    
    String name;
    double attack;
    double block;
    int selected;

    Player(String newName, double newAttack, double newBlock) {
        name = newName;
        attack = newAttack;
        block = newBlock;
        selected = 0;
        }
        
    public double getAttack() {
        return attack;
        }
}


class ScrimmageTeams {
        
    
    // String name;
    // double attack;
    // double block;
    // int selected;

    // Player(String newName, double newAttack, double newBlock) {
    //     name = newName;
    //     attack = newAttack;
    //     block = newBlock;
    //     selected = 0;
    //     }
        
    // public double getAttack() {
    //     return attack;
    //     }
}    

public class VerdeVolleyball {


    static Scanner scnr = new Scanner(System.in);   
    boolean isLoaded = false;
    ArrayList<Player> eachPlayer = new ArrayList<Player>();
    
    public void openRoster () throws IOException {

        // String fileName = "roster1.txt";

        System.out.println("openRoster initiated");

        System.out.println("Please provide roster file name: ");
        String fileName = scnr.next();
        BufferedReader file = new BufferedReader(new FileReader(fileName));

        String thisLine;
        int index=0;
        // player eachPlayer[] = new player[25];

        while ((thisLine = file.readLine()) !=null) {
            
              String words[] = thisLine.split(" ");
              eachPlayer.add(new Player(words[0] + " " + words[1],Double.parseDouble(words[2]),Double.parseDouble(words[3])));
              index++;
              
            // file.close()

        }  
        
        System.out.println("Roster Loaded!");
        chooseMenuItem();  
    }

    public void chooseAttackers(ArrayList <Player> newPlayer) throws IOException {
        System.out.println("Choose Attackers Initiated");
        List<Player> attackPlayer = newPlayer.stream()
                    .sorted(Comparator.comparing(person -> person.attack))
                    .collect(Collectors.toList());
                    Collections.reverse(attackPlayer);
                    
        attackPlayer.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.attack));        
        
        chooseMenuItem();
    }

    public void chooseBlockers(ArrayList <Player> nePlayer) throws IOException {
        List<Player> blockPlayers = nePlayer.stream()
                    .sorted(Comparator.comparing(person -> person.block))
                    .collect(Collectors.toList());
                    Collections.reverse(blockPlayers);
                    
        blockPlayers.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.block));        
        chooseMenuItem();
    }   

    public static void displayTeams(ArrayList <Player> teamPlayer){
        List<Player> teams = teamPlayer.stream()
                    .sorted(Comparator.comparing(person -> person.block))
                    .collect(Collectors.toList());
                    Collections.reverse(teams);
                    
        teams.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.block));
        
        int size = teams.size();


        int numberOfTeams = 19 / 6;
       
        System.out.println(numberOfTeams + "~~~~~~~~~~~~~~~~~~~~~~~~~~");
        

    } 

    public int chooseMenuItem () throws IOException {

        System.out.println("\n" + "Welcome to Verde Valley" + "\n");
        
        System.out.println("1) Open a roster");
        System.out.println("2) List top 3 attackers");
        System.out.println("3) List top 3 blockers");
        System.out.println("4) Make and display scrimmage teams");
        System.out.println("5) Quit" + "\n");
        System.out.println("Please choose from the following menu" + "\n");
        int userSelect = scnr.nextInt();
        selectMenuItem(userSelect);
        return userSelect;
    }

       
    public void selectMenuItem (int userInput) throws IOException {

        int userSelect = userInput;

        System.out.println(isLoaded + "THIS IS THE STATUS OF isLoaded");

        
        if (userSelect ==1) {
            isLoaded = true;
            System.out.println(isLoaded + "   NOOOOWWW THIS IS THE STATUS OF isLoaded");
            openRoster();
        } else if (isLoaded && userSelect == 2) {
            System.out.println(isLoaded + "THIS IS THE STATUS OF isLoaded in menu item 2");
            chooseAttackers(eachPlayer);
        } else if (isLoaded && userSelect == 3) {
            System.out.println(isLoaded + "THIS IS THE STATUS OF isLoaded in menu item 3");
            chooseBlockers(eachPlayer);
        } else if (isLoaded && userSelect == 4) {
            System.out.println(isLoaded + "THIS IS THE STATUS OF isLoaded in menu item 4");
            displayTeams(eachPlayer);
        } else if (userSelect !=5) {
            System.out.println(isLoaded + "THIS IS THE STATUS OF isLoaded in menu item !5");
            System.out.println("You must first select 1 to choose a roster file: " + "\n");
            chooseMenuItem();
        } else if (userSelect ==5) {
            return;
        }
    }
	

public static void main (String [] args) throws IOException{
    VerdeVolleyball verdeClass = new VerdeVolleyball();

    verdeClass.chooseMenuItem();
    
    // int test = chooseMenuItem();
    // selectMenuItem(test);


    // chooseAttackers(openRoster());
    // chooseBlockers(openRoster());
    // displayTeams(openRoster());
    
    

    // boolean loaded = false;
    // int userSelect = chooseMenuItem();

          
    
    // while (userSelect<5){
    //     ArrayList <Player> test;  

    //     if (userSelect ==1) {
    //         System.out.println("ITS HERE ~~~~~~");
    //         test = openRoster();        
    //         loaded = true;
    //         chooseMenuItem();
            
    //     } else if (userSelect == 2 && loaded) {
    //         chooseAttackers(test);

            
            
    //     } else if (userSelect == 3 && loaded) {
    //         chooseAttackers(openRoster());
            
            
    //     } else if (userSelect ==4 && loaded) {
    //         chooseAttackers(openRoster());
            
            
    //     } else {
    //         System.out.println(" YOU MUST LOAD ROSTER FIRST ");
    //         userSelect = chooseMenuItem();           
    //     }

    // }
    
    // // openRoster(userSelect);
        
        

    // }

}   
}
