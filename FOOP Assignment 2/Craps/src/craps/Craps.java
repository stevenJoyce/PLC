
package craps;

public class Craps {
//Declare and initialize a variable to represent the dice
private int Dice1;
private int Dice2;

//Create a Constructor for Game: Craps
//Create a game heading
public Craps()
{
    System.out.println("\n A game of Craps");
}//end of heading

//Create 2 different rollDice methods
public int RollDice1()
        {
            Dice1 = (int)Math.ceil(Math.random()*6);
            return Dice1;
        }//end of public rollDice1


public int RollDice2()
{
    Dice2 = (int)Math.ceil(Math.random()*6);
    return Dice2;
}//end of public rollDice2//end of public rollDice2

//Create a play() method
public void play()
{
    //declare the Dice numbers and initialize
    //a sum of the 2 dice numbers
    RollDice1();
    RollDice2();
    int RollDiceAnswer = Dice1 + Dice2;
    
    if (RollDiceAnswer ==7 || RollDiceAnswer ==11)
    {
        System.out.println("You won with: "+RollDiceAnswer);
    }//end of if
    else if ( RollDiceAnswer ==2 || RollDiceAnswer ==3 || RollDiceAnswer ==12)
    {
       System.out.println("You have lost with "+RollDiceAnswer);
    }//end of 1st else if 
    else if (RollDiceAnswer ==4 || RollDiceAnswer ==5 || RollDiceAnswer ==6 ||
            RollDiceAnswer ==8 || RollDiceAnswer ==9 || RollDiceAnswer ==10);
    {
        System.out.println("You have not lost or won, so your dice "
                + "will be rolled again?");
    }//end of 2nd else if
    //Dice will roll until new parameters are met
//    while(RollDiceAnswer !=)
//    {
//        System.out.println();
//    }
//    
    
    
    
    
    
    
 }//end of public void play

    
}//end of class

