class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) 
    {
        int n = quality.length;
        double ratio[][] = new double[n][2];
        for (int i =0 ; i < n ; i++)
        {
            ratio[i][0]=((double) wage[i])/quality[i];
            ratio[i][1]=quality[i];
        }

        Arrays.sort(ratio,(a,b)-> Double.compare(a[0],b[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);

        double ans = Double.MAX_VALUE;
        int sum = 0;

        for(double [] r : ratio)
        {
            sum +=r[1];
            heap.add((int)r[1]);
            if(heap.size() > k)
                sum -=heap.poll();
            if (heap.size() == k)
                ans = Math.min
                (ans,r[0]*sum);
        }
        return ans;
    }
}