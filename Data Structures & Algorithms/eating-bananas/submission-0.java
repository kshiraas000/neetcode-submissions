class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1; //lowest eating rate
        int maxSpeed = Arrays.stream(piles).max().getAsInt(); // gets max value of array piles
        int bestSpeed = maxSpeed; // dont get

        while (minSpeed <= maxSpeed) {
            int currentSpeed = (minSpeed + maxSpeed)/2; // try this eating speed
            
            long totalTime = 0; // hours needed with current speed
            for (int element : piles) {
                totalTime += Math.ceil((double) element / currentSpeed); // dont get
            }

            if (totalTime <= h) {
                // this eating speed is good but try shorter ones
                bestSpeed = currentSpeed;
                maxSpeed = currentSpeed - 1;
            } else {
                minSpeed = currentSpeed + 1;
            }
        }
        return bestSpeed;
    }
}
