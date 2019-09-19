
package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
    //declare input variables 
 
       int firstValue= 0;
       long b =(int) firstValue;
       String operator = "";
       int secondValue= 0;
       long c=(int) secondValue;
       int answer=0;
       long e=(int)answer;
       
     Scanner in = new Scanner(System.in);
     System.out.println("Do you wish to do a mathematical equation? : " );
     String user_input = in.nextLine();
     
     //Create a scanner for integers
        Scanner input1= new Scanner(System.in);
        
    //Create a Scanner for operator
     Scanner operatorInput = new Scanner(System.in);   
     switch (user_input) 
        {
         case "Y":
    //Mathematical input
    System.out.print("Please enter your first number: " );
    firstValue = input1.nextInt();
    
    System.out.print("Please enter your operator(+,-, * or /): " );
   
    operator = operatorInput.nextLine();
    
    System.out.print("Please enter your second number: " );
    secondValue = input1.nextInt();
    
      if (operator.equalsIgnoreCase("+"))
       {
           answer=firstValue + secondValue;
           System.out.println(answer);
       }//end of if
       else if (operator.equalsIgnoreCase("-"))
       {
         answer=firstValue - secondValue;
           System.out.println(answer);
       }//end of 1st else
        else if (operator.equalsIgnoreCase("*"))
       {
         answer=firstValue * secondValue;
           System.out.println(answer);
       }//end of 2nd else
        else if (operator.equalsIgnoreCase("/"))
       {
         answer=firstValue / secondValue;
           
           System.out.println(answer);
       }//end of 3rd else
                break;
  
   case "N":
     System.out.println("Thank you for using my program. Goodbye!");
 
       
       
       
       
    }//end of main
    
}
