package aoc.day01;

public class CombinationLock {
    private int minDialIndex = 0;
    private int maxDialIndex = 99;
    private int roundTripSteps = (maxDialIndex + 1) - minDialIndex;
    private int preciselyZeroCounter = 0;
    private int clickThruZeroCounter = 0;
    private int currentDialPosition;
    private int newDialPosition;

    CombinationLock(int initialDialPosition) {
        this.currentDialPosition = initialDialPosition;
    }   

    public void rotate(String directionWithSteps)
    {
        char direction = directionWithSteps.charAt(0);
        int steps = Integer.parseInt(directionWithSteps.substring(1));

        if (direction == 'R'){
            currentDialPosition = updateDialPosition(steps);
        } else{
            currentDialPosition = updateDialPosition(-steps);
        }

    }
     
    private int updateDialPosition(int steps){

        int adjustedNumOfSteps = steps % roundTripSteps;
        
        newDialPosition = (roundTripSteps + currentDialPosition + adjustedNumOfSteps) %  roundTripSteps;

        if (newDialPosition == 0 ) preciselyZeroCounter++;

        // Count times click thru zero

        int numberOfRoundTrips = steps / roundTripSteps; // Integer Div

        // Check whether adjusted steps cross zero. Do not count if starting at zero and moving negative.
        if ((currentDialPosition + adjustedNumOfSteps < minDialIndex) && (currentDialPosition != minDialIndex)) {
            clickThruZeroCounter = clickThruZeroCounter + numberOfRoundTrips + 1;
        } else if ((currentDialPosition + adjustedNumOfSteps > maxDialIndex) && (newDialPosition != minDialIndex)){
            clickThruZeroCounter = clickThruZeroCounter + numberOfRoundTrips + 1;
        } else  {
            clickThruZeroCounter = clickThruZeroCounter + numberOfRoundTrips;
        }


        return newDialPosition;

    }

    public int getCurrentDialPosition(){
        return currentDialPosition;
    }

    public int getPreciselyZeroCounter(){
        return preciselyZeroCounter;
    }
    
    public int getClickThruZeroCounter(){
        return clickThruZeroCounter;
    }
    
}
