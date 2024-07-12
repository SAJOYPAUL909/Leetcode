class Solution {
    public int maximumGain(String s, int x, int y) 
    {
        if (x > y)
            return gain(s, "ab", x , "ba", y);
        else
            return gain(s, "ba", y , "ab", x);   
    }

    public int gain(String s, String a, int i, String b, int j)
    {
        int ans = 0;

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char c:s.toCharArray())
        {
            if(!st1.isEmpty() && st1.peek() == a.charAt(0) &&  c == a.charAt(1))
            {
                st1.pop();
                ans += i;
            }
            else
            {
                st1.push(c);
            }
        }

         for (char c: st1)
        {
            if(!st2.isEmpty() && st2.peek() == b.charAt(0) &&  c == b.charAt(1))
            {
                st2.pop();
                ans += j;
            }
            else
            {
                st2.push(c);
            }
        }
        return ans;
    }
}