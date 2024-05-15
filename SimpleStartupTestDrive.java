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

        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed";
            //If the fake guess (2) gives back a "HIT" it's working!
        }
        System.out.println(testResult);
        //Prints test result "passed" or "failed"
    }
    
}