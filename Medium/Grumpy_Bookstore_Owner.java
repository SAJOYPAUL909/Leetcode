class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i =0 ; i < customers.length ; i++)
        {
            if (grumpy[i] == 0)
                a +=customers[i];
            else
                b +=customers[i];
            
            if (i >=minutes &&  grumpy[i-minutes] == 1)
                b -=customers[i-minutes];
            c = Math.max(c,b);
        }

        return a+c;
        
    }
}