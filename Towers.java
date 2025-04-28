public class Towers{
  //solution for towers of hanoi
  private int numDiscs; //number of discs
  //constructor parameter is number of discs
  public Towers(int discs){
    this.numDiscs = discs;
    //call the recursive method
    moveDiscs(numDiscs, 'A', 'B', 'C');
     //the moveDiscs method displays a disc move
    private void moveDiscs(int num, char fromPeg, char toPeg, char tempPeg){
      if(num > 0){
        moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
        System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);
        //move a disc fromPeg to toPeg
        moveDiscs(num - 1, tempPeg, toPeg, fromPeg);

      }
    }  
  }
}