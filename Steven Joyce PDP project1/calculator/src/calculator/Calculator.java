
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
    //declare input variables 
 
        int firstValue= 0;
         long b =(int) firstValue;
        String operator = "";
        int secondValue= 0;
        long c=(int) secondValue;
       int answer=0;
       long e=(int)answer;
       
       boolean firstValue2=false;
       boolean secondValue2=true;
       boolean relanswer=false;
       boolean relanswer2=true;
       boolean yes=true;
       boolean no=false;
      String ans = "";  
    do {
//creating a object of the scanner class
    Scanner in = new Scanner(System.in);
    
     System.out.print("Please choose what type of calculation is required: "
            + "M Mathematical, B Boolean or R Rational? : " );
        String user_input = in.nextLine();
        
    //Create a scanner for integers
        Scanner input1= new Scanner(System.in);
        
    //Create a Scanner for operator
     Scanner operatorInput = new Scanner(System.in);  
     
     //scanner object to repeat or stop 
     Scanner userInput = new Scanner(System.in);   
    
     
     //Switch Statement to store and output user input
     switch (user_input) 
        {
         case "M":
    System.out.println("Calculation required is Mathematical");
    //If statement to use the userinput to solve problem

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
  
   case "B":
    System.out.println("Calculation required is Boolean");
                    //Boolean input
    System.out.print("Please enter your first value(true or false): " );
    firstValue2 = input1.nextBoolean();
    
    System.out.print("Please enter your operator(&& or ||): " );
    operator = operatorInput.nextLine();
    
    System.out.print("Please enter your second value(true or false): " );
    secondValue2 = input1.nextBoolean();
 
    if (operator.equalsIgnoreCase("&&"))
       {
         relanswer= firstValue2 && secondValue2;
           
           System.out.println(answer);
       }//end of if
 else if (operator.equalsIgnoreCase("||"))
       {
        relanswer2= firstValue2 && secondValue2;
           
           System.out.println(answer); 
       }//end of else
     break;
 
  case "R":
  System.out.println("Calculation rquired is Rational");
  //Rational input
    System.out.print("Please enter your first number: ");
    firstValue = input1.nextInt();
    
    System.out.print("Please enter your operator(< or >): ");
    operator =operatorInput.nextLine();
    
    System.out.print("Please enter your second number: ");
    secondValue = input1.nextInt();
    
    if (operator.equalsIgnoreCase("<"))
       {
       relanswer2 = firstValue < secondValue;
           
           System.out.println(answer);
                break;
       }//end of if
     else if (operator.equalsIgnoreCase(">"))
       {
         relanswer = firstValue > secondValue;
           
           System.out.println(answer); 
       }//end of else
       }//end of switch     


System.out.println("Do you wish to do another calculation? (Y/N): " );
    ans = userInput.nextLine(); // 
    
} while ("Y".equals(ans));

}//end of main
    
}//end of class
