/**
 * SimpleStartupTestDrive
 */
public class SimpleStartupTestDrive {
    //This is the main class

    //This is the main method
    public static void main(String[] args) {
        //This instantiates a SimpleStartup object
        SimpleStartup dot = new SimpleStartup();

        //This makes an int array for the location of the Startup. 3 consecutive ints out of a possible 7
        int[] locations = {2,3,4};
        //Invokes the setter method on the startup
        dot.setLocationCells(locations);

        int userGuess = 2;

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed";
            //If the fake guess (2) gives back a "HIT" it's working!
        }
        System.out.println(testResult);
        //Prints test result "passed" or "failed"

        public String checkYourself(int guess){
            String result = "MISS";// make a variable to hold the result we'll return. Put "miss" in as the default
    
            for(int cell : locationCells) { //Repeat with each cell in the locationCells array
                if(guess == cell){ //Compare the user guess to this element cell in the array
                    result = "hit";
    
                    numOfHits++;
    
                    break;
                }
            }
        }
            if (numOfHits == locationCells.length){
                results = "KILL!";
            }
            
        System.out.println(result); //Displays result for the user
            return result;
    } 
}