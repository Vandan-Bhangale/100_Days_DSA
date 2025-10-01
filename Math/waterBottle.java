class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;  // You drink all initial bottles
        int empty = numBottles;

        while (empty >= numExchange) {
            int newFull = empty / numExchange;   // How many new bottles you get
            totalDrunk += newFull;               // Drink them
            empty = empty % numExchange + newFull; // Remaining empties + new ones
        }

        return totalDrunk;
    }
}
