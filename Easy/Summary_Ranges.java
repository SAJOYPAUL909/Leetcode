import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int s;
        List<String> li = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            s = nums[i];
            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
                i++;
            }

            if (s == nums[i]) {
                li.add(s + "");
            } else {
                li.add(s + "->" + nums[i]);
            }
        }
        return li;
    }
}