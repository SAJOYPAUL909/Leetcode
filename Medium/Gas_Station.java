import java.util.Arrays;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int ans = 0;
        int gassum = Arrays.stream(gas).sum();
        int costsum = Arrays.stream(cost).sum();

        if (costsum > gassum) {
            return -1;
        }
        for (int i = 0; i < gas.length; i++) {
            tank = tank + gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                ans = i + 1;
            }

        }
        return ans;
    }
}