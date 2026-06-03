class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> numbers = new HashSet<>();
        for(int currentNum:nums){
            boolean notThere = numbers.add(currentNum);
            if(!notThere){
                return true;
            }
        }
        return false;
    }
}