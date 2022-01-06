/*
    - Array mit dem Namen nums
    - Die Anzahl der Zahlen im Array entspricht "n"
    - Die Zahlen im Array nums sind größer als 0 und kleiner gleich "n"
    
    - Ziel: Es soll ein Array zurückgegeben werden, in welchem die Zahlen, welche nicht im Array nums waren und größer als 0 und kleiner gleich "n" sind
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];        
        for (int num : nums) {
            arr[num-1]++;
        }
        
        ArrayList answer = new ArrayList();
        for (int i=0; i < nums.length; i++) {
            if (arr[i] == 0) answer.add(i+1);
        }
        
        return answer;
    }
}