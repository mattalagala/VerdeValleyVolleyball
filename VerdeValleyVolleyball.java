import java.util.Currency;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.lang.String;



class Roster {
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

class VerdeValleyVolleyball {
    static Scanner scnr = new Scanner(System.in);

    

    public static int chooseMenuItem () throws IOException {

        System.out.println("Welcome to Verde Valley");
        System.out.println("Please choose from the following menu");
        int userSelect = scnr.nextInt();
        
        while (userSelect <=5) {
            
            if (userSelect == 1) {
                System.out.println("1111111111111111111");
                System.out.println("Please provide roster file name: ");
                String fileName = "roster1.txt";
                // String fileName = scnr.next();
                openRoster();
                return userSelect;

            } else if (userSelect == 2) {
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


    
  
        public static void openFile (String fileName) throws FileNotFoundException {
     
            //creating File instance to reference text file in Java
            File text = new File(fileName);
         
            //Creating Scanner instnace to read File in Java
            Scanner scnr = new Scanner(text);
         
            //Reading each line of file using Scanner class
            int lineNumber = 1;
            while(scnr.hasNextLine()){
                String line = scnr.nextLine();
                System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }      
       
        }  
     
    
    












    
    public static String [][][] openRoster () throws FileNotFoundException {
        
        
        Scanner rosterData = new Scanner(new File("roster1.txt"));
        int lineCount = 0;
        int count = 0;
        int newCount = 0;
        int i = 0;
        int rows=20;
        int cols = 20;
        int j = 0;
        int k =0;
        String charLine = " ";
        String charLine2 = " ";
        String blockArray [] = new String [rows];
        String totalArray [][][] = new String [20][20][20];
        int first = 0;
        
        String currentLine = " ";
        

        while (rosterData.hasNextLine()) {
            currentLine = rosterData.nextLine();
            // System.out.println("   ~~~~~~~#@#$@#$@#   "+currentLine+"   $@#$@#$#@$~~~~~~");

            blockArray[i] = currentLine;
          
            String fourLetter = blockArray[i].substring(blockArray[i].length()-4, blockArray[i].length());
            totalArray[i][j][k] = fourLetter;
            k++;
            String eightLetter = blockArray[i].substring(blockArray[i].length()-8, blockArray[i].length());
            totalArray[i][j][k] = eightLetter;
            j++;
            String nameLetter = blockArray[i].substring(first, blockArray[i].length()-8);
            totalArray[i][j][k] = nameLetter;
            i++;
            

            System.out.println(totalArray[i][j][k]+ "~~~~~~~~~~~~~");
        }

        

            // System.out.println(fourLetter+ "   ~~~~~~~#@#$@#$@#$@#$@#$#@$~~~~~~");
            
            // for (int j=0; j<myArray[i].length(); j++) {

            //     String fourLetter = myArray[i].substring(i,i+4);
            //

            //     System.out.println(fourLetter+ "~~~~~~~#@#$@#$@#$@#$@#$#@$~~~~~~");

            // }



            
            // for (i=0; i<=myArray.length; i++) {
            //     // currentLine = rosterData.nextLine();
            //     myArray[i] = currentLine;




                // System.out.println(currentLine + "==========");
            //     System.out.println(Arrays.toString(myArray)+ "++++++++++");
                
            // // }


            // System.out.println(Arrays.toString(myArray)+ "++++++++ COMPLETE ARRAY ++++++++++");
           

            
         
        
        // System.out.println(Arrays.toString(myArray2)+ "   2222222222222");
        // System.out.println(myArray[0]+ "~~~~~~ARRAY WITH INDEX 0~~~~~~~");


        return totalArray;
          
    }

    public static void splitArray (String [][][] totalArray) {

        System.out.println(Arrays.deepToString(totalArray)+ "~~~~~~~~~~~~~");

        


    }
    
    public static void topThreeAttackers () {
        

    }
    
    public static void topThreeBlockers () {
        

    }
    
    public static void makeTeams () {
        

    }

    public static void displayTeams () {
        
        // String names = " Pet, Lee, Tom, Edo";
        // String[] splitNames = names.split(", ");
     
        // System.out.println(Arrays.toString(splitNames));
    }
    

	

    public static void main (String [] args) throws IOException{
        
        String [][][] test = openRoster();
        splitArray(test);
     
        
        


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