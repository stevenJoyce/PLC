
package craps;
import java.util.Scanner;
public class CrapsMain {

    public static void main(String[] args) {
        // Create an instance if the DiceGame object
            Craps myGame = new Craps();
        
//        //Play game of dice
//        myGame.play();
        
      //Create a scanner object for user input
        //scanner object to repeat or stop 
     Scanner userInput = new Scanner(System.in);
     
     //Ask if user wants to play the game or not?
       System.out.println("Do you wish to do another calculation? (Y/N): " );
        String ans = userInput.nextLine(); 
        if( "Y".equals(ans))
        {
         //Play game of dice
          myGame.play();
        }//end of if
        else if ("N".equals(ans));
        {
             System.out.println("Goodbye");
        }//end of else if
                   
      
    }//end of main
    
}//end of class
