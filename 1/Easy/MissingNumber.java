/*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/
class Solution {
    public int missingNumber(int[] nums) {        
        Arrays.sort(nums);
        int missing = 0;
        int length = nums.length;
        
        for(int i=0; i < nums.length; i++) {
            if (i!=0) {
                if (nums[i] != (nums[i-1]+1)) {
                    missing = nums[i] - 1;
                }
            }
        }
        
        if (nums[length-1] != length) missing = length;
        
        return missing;
    }
}