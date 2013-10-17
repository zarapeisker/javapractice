import java.util.*;

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    //declare and initialize the variables we'll need

    private void setUpGame() {
        //first make some dot coms and five them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        //make three DotCom objects, give them names, and stick them in the ArrayList

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("try to send them all in the fewest number of guesses");
        //print instructions for user

        for (DotCom dotComToSet : dotComsList) {
          //repeat with each DotCom in the list
          ArrayList<String> newLocation = helper.placeDotCom(3);
          //ask the helper for a DotCom location
          dotComToSet.setLocationCells(newLocation);
          //call the setter method on this DotCom to give it the location from the helper
        } //close for loop
    }//close setUpGame method

    private void startPlaying() {
        while(!dotComsList.isEmpty()) {
            //as long as the DotCom list is NOT empty
            String userGuess = helper.getUserInput("Enter a guess");
            //get user input
            checkUserGuess(userGuess);
            //call checkUserGuess method
        } //close while
        finishGame();
        //call finishGame method
    }//clost startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        //increment the number of guesses the user has made
        String result = "miss";
        //default to "miss"

        for (DotCom dotComToTest : dotComsList) {
        //repeat with every DotComs in the list
            result = dotComToTest.checkYourself(userGuess);
            //ask the DotCom to check the user guess
            if (result.equals("hit")) {
                break;
                //get out of the game loop
            }
            if (result.equals("kill"))
            {
                dotComsList.remove(dotComToTest);
                //take out of the list because dead
                break;
            }
        }
        System.out.println(result);
        //print result for user
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead!  Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        }
        else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }//print message for user: how did they do?
    }//close method

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        //create the game object
        game.setUpGame();
        //game object sets up game
        game.startPlaying();
        //game object starts playing
    }
}
