public class SimpleDotComGame {

  public static void main(String[] args) {
    int numOfGuesses = 0;
    //tracks how many guesses the user makes
    GameHelper helper = new GameHelper();
    //gets user input

    SimpleDotCom theDotCom = new SimpleDotCom();
    //makes dotcom object
    int randomNum = (int) (Math.random() * 5);
    //makes random numfor the first cell

    int[] locations = {randomNum, randomNum+1, randomNum+2};
    theDotCom.setLocationCells(locations);
    //give the dotcomits locations(the array)
    boolean isAlive = true;
    //make a booolean variable to track whether the game is still alive

    while(isAlive == true) {
      String guess = helper.getUserInput("enter a number");
      //gets user input string
      String result = theDotCom.checkYourself(guess);
      //check guess
      numOfGuesses++;
      //increment guess count
      if (result.equals("kill")) {
        //if "kill" set isAlive to false
        isAlive = false;
        System.out.println("You took" + numOfGuesses + " guesses");
      }// close if
    } //close while
  } //close main
} //close class