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
        
        while (userSelect <=5) {
            
            if (userSelect == 1) {
                System.out.println("1111111111111111111");
                System.out.println("Please provide roster file name: ");
                
                openRoster();
                return userSelect;

            } else if (userSelect == 2) {
                // chooseAttackers();
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

        
        // eachPlayer.add(new player(name:: words[0] + " " + words[1], attack:: Double.parseDouble(words[2], block:: Double.parseDouble(words[3]))));


        while ((thisLine = file.readLine()) !=null) {
            
              String words[] = thisLine.split(" ");

              

              eachPlayer.add(new player(words[0] + " " + words[1],Double.parseDouble(words[2]),Double.parseDouble(words[3])));
              
            //   eachPlayer[index].name = words[0] + " " + words[1];
            //   eachPlayer[index].attack = Double.parseDouble(words[2]);
            //   eachPlayer[index].block = Double.parseDouble(words[3]);

            //   eachPlayer[index] = new player();
            //   eachPlayer[index].name = words[0] + " " + words[1];
            //   eachPlayer[index].attack = Double.parseDouble(words[2]);
            //   eachPlayer[index].block = Double.parseDouble(words[3]);
              
              index++;
              System.out.println(Arrays.toString(words));
              
                System.out.println(eachPlayer + "  ARRAYYY LIISTTTT ");
            
            
            // System.out.println(Arrays.toString(eachPlayer));

            // file.close();

            
        }  
        System.out.println(eachPlayer + "  ARRAYYY LIISTTTT ");
        return eachPlayer;    
    }

    public static void chooseAttackers(ArrayList <player> newPlayer){

        
        // List<player> attackPlayer = new ArrayList <>();

        List<player> attackPlayer = newPlayer.stream()
                    .sorted(Comparator.comparing(person -> person.attack))
                    .collect(Collectors.toList());
                    Collections.reverse(attackPlayer);
                    
        attackPlayer.stream().limit(3).forEach(person-> System.out.println(person.name + " " + person.attack+ " " + person.block));
        // System.out.println(Arrays.toString(attackPlayer.get(0)) + "  WWWOOOOOOOWWW ");

        // for(player current_cat : newPlayer){
        //     if(current_cat.name != null){
        //        current_cat = newPlayer[i];
        //     }
        //  }

        // int count;
        // count = newPlayer.length-1;
        // System.out.println(count+"~~~~~~~~~~~");

        // player temp_player = new player();
        // for(int sort_iters = 0; sort_iters < 15; sort_iters++) {
                 
        //    for(int index = 0; index < 15-sort_iters-1; index++) {				
        //       if(newPlayer[index].name.compareTo(newPlayer[index+1].name) > 0){ 
        //          // Swap
        //          temp_player = newPlayer[index];
        //          newPlayer[index] = newPlayer[index+1];
        //          newPlayer[index+1] = temp_player;
        //       }
        //    }
        // }
     








        // for(int i=0;i<14;i++){
        //     int j = 1;
        //     if(newPlayer[i].attack > newPlayer[j].attack){
        //         player temp = newPlayer[i];
        //         newPlayer[i] = newPlayer[j];
        //         newPlayer[j] = temp;
        //         j++;
        //     }
        
        // }
        // System.out.println("~~~~~~~~~~~"+(newPlayer[15].name)+"~~~~~~~~~~~");
        // System.out.println("~~~~~~~~~~~"+(newPlayer[15].attack)+"~~~~~~~~~~~");
        
    }


        
    public static void openRoster (int userSelect) throws FileNotFoundException, IOException {
        
        
           }   
       
    

	

public static void main (String [] args) throws IOException{
    
    int userSelect = chooseMenuItem();
    chooseAttackers(openRoster());
    // openRoster(userSelect);
        
        

    }

}   

