import java.util.Scanner;
import java.lang.reflect.Array;

/* Justin Yu
 * Clackers
 */

class Clackers{
  public static void main (String[] args){
    Scanner myScanner = new Scanner (System.in);
    
    
    String name;
    DiceNumber dice;
    dice = new DiceNumber();
    
    int amountofdice;
    int options;
    int markedvalue = 0;
    int expectedmatch = 0;
    int score = 0;
    int [] diceflow = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    
    Scoreboard [] scoreboards = new Scoreboard[10];
    
    for (int x = 0; x < scoreboards.length; x++){ 
      scoreboards[x] = new Scoreboard();
      score = 0;
        
        System.out.println("Please enter your name");
      name = myScanner.next();
      scoreboards[x].setName(name);
      System.out.println("Welcome " +name+ " to Justin's game of Clackers!");
      
      System.out.println("RULES");
      
      
      System.out.println("How many dices would you like to play with (2 - 4 dies)");
      amountofdice = myScanner.nextInt();
      System.out.println(amountofdice);
      do {
        if (amountofdice >= 2 && amountofdice <= 4){
          System.out.println("You will have " +amountofdice+ " dices"); 
        }
        else {
          System.out.println("INVALID amount please re-enter between 2 and 4 dices");
          amountofdice = myScanner.nextInt();
        } 
      }while ( amountofdice < 2 || amountofdice > 4);
      
      if (amountofdice == 2){
        System.out.println("Value of dice 1: " +dice.getDice1()+ " value of dice 2: " +dice.getDice2()+ " total of 2 dice: " +dice.getTotal2dice());
      }
      else if (amountofdice == 3){
        System.out.println("Value of dice 1: " +dice.getDice1()+ " value of dice 2: " +dice.getDice2()+ " value of dice 3 "+dice.getDice3()+ " total of 3 dice: " +dice.getTotal3dice());
      }
      else {
        System.out.println("Value of dice 1: " +dice.getDice1()+ " value of dice 2: " +dice.getDice2()+ " value of dice 3 "+dice.getDice3()+ " value of dice 4 " +dice.getDice4()+ " total of 2 dice: " +dice.getTotal4dice());
      }
      
      if (amountofdice == 2){
        expectedmatch = 12;
      }
      else if (amountofdice == 3){
        expectedmatch = 18;
      }
      else expectedmatch = 24;{
      }
      
      do{
        
        System.out.println("Please select 1 of the 3 options 1, 2, or 3");
        System.out.println("Option 1 - cover both numbers");
        System.out.println("Option 2 - cover sum of 2 numbers");
        System.out.println("Option 3 - computer choice");
        
        /////////////////////////////////////
        System.out.println("hello");
        /////////////////////////////////////
        
        
        System.out.println("Value of dice 1: " +dice.getDice1()+ " value of dice 2: " +dice.getDice2()+ " total of 2 dice: " +dice.getTotal2dice());
        
        options = myScanner.nextInt();
        do{
          if (options > 0 && options < 4){
          }
          else  {
            System.out.println("Invalid choice please try again");
            options = myScanner.nextInt();
          }
          
        } while (options < 0 || options > 3);
        //////////////////////////////
        
        
        
        System.out.println("Choice: " +options);
        
        int d1 = dice.getDice1()-1;
        int d2 = dice.getDice2()-1;
        int d3 = dice.getDice3()-1;
        int d4 = dice.getDice4()-1;
        int dt2 = dice.getTotal2dice()-1; 
        int dt3 = dice.getTotal3dice()-1;
        int dt4 = dice.getTotal4dice()-1; //finding position for the array
        //////////////////////////////  
        
        System.out.println("test " +amountofdice+ "options " +options);
        
        
     if(amountofdice == 2){
            if (options == 1){
            Array.set (diceflow, d1, 1);
            Array.set (diceflow, d2, 1);
            System.out.println("s2hello1");
          }
            else if (options == 2 && dt2 >=6){
              Array.set (diceflow, dt2, 1);
              System.out.println("s2hello2");
            }
            else if (options == 2 && dt2 < 6){
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              System.out.println("s2hello3");
            }
            else if (options == 3 && dt2 > 5 && diceflow[dt2] == 0){
              Array.set (diceflow, dt2, 1);
              System.out.println("s2hello4");
            }
            else {
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              System.out.println("s2hello5");
            }
        }
          if (amountofdice == 3){
            if (options == 2){
            Array.set (diceflow, d1, 1);
            Array.set (diceflow, d2, 1);
            Array.set (diceflow, d3, 1);
            System.out.println("s3hello1");
          }
            else if (options == 2 && dt3 >=12){
              Array.set (diceflow, dt3, 1);
              System.out.println("s3hello2");
            }
            else if (options == 2 && dt3 < 12){
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              Array.set (diceflow, d3, 1);
              System.out.println("s3hello3");
            }
            else if (options == 3 && dt3 > 11 && diceflow[dt3] == 0){
              Array.set (diceflow, dt3, 1);
              System.out.println("s3hello4");
            }
            else {
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              Array.set (diceflow, d3, 1);
              System.out.println("s3hello5");
            }
          }
          if (amountofdice == 4){
            if (options == 3){
            Array.set (diceflow, d1, 1);
            Array.set (diceflow, d2, 1);
            Array.set (diceflow, d3, 1);
            Array.set (diceflow, d4, 1);
            System.out.println("s4hello1");
          }
            else if (options == 2 && dt4 >=18){
              Array.set (diceflow, dt4, 1);
              System.out.println("s4hello2");
            }
            else if (options == 2 && dt3 < 18){
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              Array.set (diceflow, d3, 1);
              Array.set (diceflow, d4, 1);
              System.out.println("s4hello3");
            }
            else if (options == 3 && dt4 > 17 && diceflow[dt4] == 0){
              Array.set (diceflow, dt4, 1);
              System.out.println("s4hello4");
            }
            else {
              Array.set (diceflow, d1, 1);
              Array.set (diceflow, d2, 1);
              Array.set (diceflow, d3, 1);
              Array.set (diceflow, d4, 1);
              System.out.println("s4hello5");
            }
          }
            // numbers amount of dice
        
        System.out.println("hello100");
        options = 0; // reset the option because you can choose next options 
        markedvalue = 0;
        for ( int i =0; i < expectedmatch; i++){
          if (diceflow[i] == 1){
            markedvalue = markedvalue + 1;
          }
        }
        System.out.println("markedvalue " +markedvalue);
        
        dice.roll();
        score++;
        
        // check to see if number is chosen and if chosen set value to 1
        for (int j = 0; j < expectedmatch; j++){   
          System.out.println(diceflow[j]);
        }
        
        
        
      }while (markedvalue < expectedmatch);
      scoreboards[x].setScore(score);
      for (int j = 0; j<expectedmatch;j++){
      diceflow[j] = 0;
      }
      
    }
    for (int i = 0; i < scoreboards.length-1; i++){
      for (int j = 0; j < scoreboards.length-1-i; j++){
//        if (scoreboards[j].getScore().compareTo(scoreboards[j+1].getScore())>0){
        if (scoreboards[j].getScore() > (scoreboards[j+1].getScore())){
          int temp1 = scoreboards[j].getScore();
          int temp2 = scoreboards[j+1].getScore();
         scoreboards[j].setScore (temp2);
          scoreboards[j+1].setScore(temp1) ;
         String temp3 = scoreboards[j].getName();
         String temp4 = scoreboards[j+1].getName();
         scoreboards[j].setName(temp4); 
          scoreboards[j+1].setName(temp3);
        }
      }
    }
    
    System.out.println("Scoreboard ~~ results");
      for (int y = 0; y < scoreboards.length; y++){
       System.out.println("Name: " + scoreboards[y].getName()+ " Score: " +scoreboards[y].getScore()); 
      }
 myScanner.close();     
  }

}




  
