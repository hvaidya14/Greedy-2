// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();
        int start=0;
        int end=0;
        for (int i=0;i<s.length();i++) {
            m.put(s.charAt(i), i);
        }
        for(int i=0;i<s.length();i++) {
            end = Math.max(end, m.get(s.charAt(i)));
            if (i == end) {
                result.add(end-start+1);
                start=i+1;
            }
        }

        return result;
    }
}
