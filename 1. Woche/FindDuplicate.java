class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;  
        HashSet<Integer> al = new HashSet();
        
        for(int num : nums){
            if (!al.contains(num)){
                al.add(num);
            } else {
                duplicate = true;
            }
        }
        
        return duplicate;
    }
}

class public static void main(String[] args) {
    System.out.println(containsDuplicate([1,2,3,4]));
}