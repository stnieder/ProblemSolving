/* Finding the single number in an array, that contains duplicate numbers except one: [2,2,1] */

class Solution {
    public int singleNumber(int[] nums) {
        /* A harder solution
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
        */

        //A little bit easier
        Arrays.sort(nums);
        int answer = 0;
        if(nums.length = 1) answer = nums[0];
        else{
            for(int i=0;i<nums.length-1;i=i+2){
                if(nums[i]!=nums[i+1]){
                    ans = nums[i];
                    break;
                }
                else{
                    ans = nums[nums.length-1];
                }
            }
        }
        
        return answer;
    }
}