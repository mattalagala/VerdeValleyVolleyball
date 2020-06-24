import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;


class VerdeValleyVolleyball {
    static Scanner scnr = new Scanner(System.in);


    public static void chooseMenuItem () {

        // System.out.println("Please choose from the following menu");
        // int userSelect = scnr.input();

        // System.out.println(userSelect);

        // if(userSelect ==1) {
        //     System.out.println("~~~~~~" + userSelect);
        //     if (userSelect == 1) {
        //         System.out.println("1111111111111111111");

        //         userSelect--;

        //     // } else if (userSelect.equals("2")) {
        //     //     System.out.println("222222222222222222222");

        //     // } else if (userSelect.equals("3")) {
        //     //     System.out.println("333333333333333333333333");
                
        //     // } else if (userSelect.equals("4")) {
        //     //     System.out.println("444444444444444444444444");
                
        //     // } else if (userSelect.equals("5")) {
        //     //     System.out.println("555555555555555555555555555");
                
        //     }

        // }
    }

    // public static void startMenu() {

    //     if (userSelect.equals("1")) {

    //     } else if (userSelect.equals("2")) {

    //     } else if (userSelect.equals("3")) {
            
    //     } else if (userSelect.equals("4")) {
            
    //     } else if (userSelect.equals("5")) {
            
    //     }

    // }

    
}

class Main {
    static Scanner scnr = new Scanner(System.in);
    public static int chooseMenuItem () {

        System.out.println("Welcome to Verde Valley");
        System.out.println("Please choose from the following menu");
        int userSelect = scnr.nextInt();

        while (userSelect <=5) {
            
            if (userSelect == 1) {
                System.out.println("1111111111111111111");
                openRoster();
                return userSelect;
            } else if (userSelect == 2) {
                System.out.println("222222222222222222222");
                return userSelect;
            } else if (userSelect == 3) {
                System.out.println("333333333333333333333333");
                return userSelect;
            } else if (userSelect == 4) {
                System.out.println("444444444444444444444444");
                return userSelect;
            } else if (userSelect == 5) {
                System.out.println("555555555555555555555555555");
                break;
            }
            

        } return userSelect;

    }
    
    public static void openRoster () {
        

    }
    
    public static void topThreeAttackers () {
        

    }
    
    public static void topThreeBlockers () {
        

    }
    
    public static void makeTeams () {
        

    }

    public static void displayTeams () {
        

    }

    public static void main (String [] args) {
        
        chooseMenuItem();
        
        


    }

}
    


// public static long display_problem(long problem_type) {
             
//     long correct_answer = 0;
//      // Loop to iterate through the users selection   
//      while (problem_type <= 4 ) {
        
//         if (problem_type == 1) {
//             correct_answer = solve_y();
//             return correct_answer;
//         } else if (problem_type == 2) {
//             correct_answer = solve_m();
//             return correct_answer;
//             }
//           else if (problem_type == 3) {
//             correct_answer = solve_b();
//             return correct_answer;
//             }
//           else if (problem_type == 4) {
//             System.out.println("Goodbye!");
//             break;
//             }          
//     return correct_answer; 
//         }
//     //Required return statement for method
//     return  correct_answer;        
// }

//  //Method to get user's selection
// public static long which_problem() {
//     //Gets user answer by calling scnr.nextInt() and saving to user_answer
//     System.out.println("Select 1 to Solve for Y, 2 to Solve for M, 3 to Solve for B and 4 to quit!" );    
//     int problem_type = scnr.nextInt();
        
//     return problem_type;
        
// }