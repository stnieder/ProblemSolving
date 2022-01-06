/* Finding the single number in an array, that contains duplicate numbers except one: [2,2,1] */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> countingNumbers = new HashMap<Integer,Integer>(nums.length);
        
        for (int i=0; i < nums.length; i++) {
            if(countingNumbers.containsKey(nums[i])) {
                int value = countingNumbers.get(nums[i]);
                countingNumbers.replace(nums[i], value, value+1);
            } else {
                countingNumbers.put(nums[i],1);
            }
        }
        
        int number = 0;
        for (Map.Entry<Integer,Integer> set : countingNumbers.entrySet()) {
            if (set.getValue() == 1) {
                number = set.getKey();
            }
        }
        
        return number;
    }
}