public class Game {
    
    int numOfGuesses = 0;// This tracks how many guesses the user makes.

    GameHelper helper = new GameHelper();

    SimpleStartup theStartup = new SimpleStartup();//Creates the Startup Object.

    int randomNum = (int) (Math.random() *5); //Make a random number for the first cell and use it to make the cell locations array.

    int [] locations = {randomNum, randomNum + 1, randomNum +2};
    the Startup.setLocationCells(location);// Give the Startup its location on the array.

    boolean isAlive = true; //boolean variable to track whether the game is still alive. to use in the while loop test repeat while game is still alive.

    while (isAlive){

        int guess = helper.getUserInput("enter a number");//User input getter

        String result = theStartup.checkYourself(guess); //Ask the Startup to check the guess. Save the returned result.

        numOfGuesses++;// increments guess count by one.

        if(result.equals("KILL")){
            isAlive = false;

            System.out.println("You took " + numOfGuesses + " guesses");

        }

    }

}
