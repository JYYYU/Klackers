//dice randomizer and sum
public class DiceNumber {
  private int dice1;
  private int dice2;
  private int dice3;
  private int dice4;
  
  public DiceNumber(){
    roll();
  }
  public void roll(){
    dice1 = (int)(Math.random()*6) +1;
    dice2 = (int)(Math.random()*6) +1;
    dice3 = (int)(Math.random()*6) +1;
    dice4 = (int)(Math.random()*6) +1; // random number generator
  }
  public int getDice1() {
    return dice1; //method random for dice1
  }
  public int getDice2() {
    return dice2; //method random for dice2
  }
  public int getDice3() {
    return dice3; //method random for dice3
  }
  public int getDice4() {
    return dice4; //method random for dice4
  }
  public int getTotal2dice(){
    return dice1 + dice2;
  }
  public int getTotal3dice(){
    return dice1 + dice2 + dice3;
  }
  public int getTotal4dice(){
    return dice1 + dice2 + dice3 + dice4;
  }
} //end class


    
    
    
    