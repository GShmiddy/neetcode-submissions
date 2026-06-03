class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] sArray = cleaned.toCharArray();
        int j = sArray.length-1;
        for(int i =0; i<j; i++){
            if(sArray[i]!=sArray[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
