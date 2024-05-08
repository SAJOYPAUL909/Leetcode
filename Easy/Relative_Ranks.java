class Solution {
    public String[] findRelativeRanks(int[] score) {
       
        int n = score.length;
        String ans[] = new String[n];
        List<Integer> index = new ArrayList<>();

        for (int i = 0 ; i < n ; i++)
            index.add(i);

        Collections.sort(index,(a,b) -> score[b] - score[a]);

        for (int i = 0 ; i < n ; i++)
        {
            if (i == 0)
            ans[index.get(0)] = "Gold Medal";
            else if (i == 1)
            ans[index.get(1)] = "Silver Medal";
            else if (i == 2)
            ans[index.get(2)] = "Bronze Medal";
            else
            ans[index.get(i)] = String.valueOf(i+1);
        }
    return ans;
    }
}