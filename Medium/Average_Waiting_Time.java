class Solution {
    public double averageWaitingTime(int[][] customers) 
    {
        double wait = 0;
        double cur = 0;

        for(int c[] : customers)
        {
            cur =   Math.max(cur, c[0]) + c[1];
            wait += cur - c[0];
        }
        return wait/customers.length;

    }
}