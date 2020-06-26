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

class player {
        
    
    String name;
    double attack;
    double block;
    int selected;

    player(String newName, double newAttack, double newBlock) {
        name = newName;
        attack = newAttack;
        block = newBlock;
        selected = 0;
        }
        
    public double getAttack() {
        return attack;
        }
}    

public class VerdeValleyVolleyball {

    static Scanner scnr = new Scanner(System.in);   
        

    public static int chooseMenuItem () throws IOException {

        System.out.println("Welcome to Verde Valley");
        System.out.println("Please choose from the following menu");
        int userSelect = scnr.nextInt();
        ArrayList <player> playerArray = new ArrayList <player>();
        while (userSelect <=5) {
            
            if (userSelect == 1) {
                System.out.println("1111111111111111111");
                System.out.println("Please provide roster file name: ");
                
                playerArray = openRoster();
                return userSelect;

            } else if (userSelect == 2) {
                chooseAttackers(playerArray);
                System.out.println(userSelect + "222222222222222222222");
 
                return userSelect;
            } else if (userSelect == 3) {
                System.out.println("333333333333333333333333");
                return userSelect;
            } else if (userSelect == 4) {
                System.out.println("444444444444444444444444");
                return userSelect;
            } else if (userSelect == 5) {
                System.out.println("555555555555555555555555555");
                //break;
            }
            
        }
        return userSelect;

    }

    public static ArrayList <player> openRoster () throws IOException {

        String fileName = "roster1.txt";
                // String fileName = scnr.next();
        BufferedReader file = new BufferedReader(new FileReader(fileName));

        String thisLine;
        int index=0;
        // player eachPlayer[] = new player[25];


        ArrayList<player> eachPlayer = new ArrayList<player>();

        while ((thisLine = file.readLine()) !=null) {
            
              String words[] = thisLine.split(" ");
              eachPlayer.add(new player(words[0] + " " + words[1],Double.parseDouble(words[2]),Double.parseDouble(words[3])));
              index++;
              
            // file.close()

        }  
        
        return eachPlayer;    
    }

    public static void chooseAttackers(ArrayList <player> newPlayer){

        List<player> attackPlayer = newPlayer.stream()
                    .sorted(Comparator.comparing(person -> person.attack))
                    .collect(Collectors.toList());
                    Collections.reverse(attackPlayer);
                    
        attackPlayer.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.attack));
        
        
    }


        
    public static void chooseBlockers(ArrayList <player> newPlayer){
        List<player> blockPlayers = newPlayer.stream()
                    .sorted(Comparator.comparing(person -> person.block))
                    .collect(Collectors.toList());
                    Collections.reverse(blockPlayers);
                    
        blockPlayers.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.block));
        
        
           }   
       
    

	

public static void main (String [] args) throws IOException{
    
    int userSelect = chooseMenuItem();
    chooseAttackers(openRoster());
    // openRoster(userSelect);
        
        

    }

}   

