class Solution {
    public int mySqrt(int x) 
    {
        int l = 0;
        int r = x  ;

        while (l < r)
        {
            int m = (l+r+1)/2;
            if(m <= x/m)
                l = m;
            else
                r = m -1;
        }   
        return l;     
    }
}