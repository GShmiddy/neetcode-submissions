class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char letter: s.toCharArray()){
            if(sMap.containsKey(letter)){
                sMap.put(letter, sMap.get(letter)+1);
            }
            else{
            sMap.put(letter, 1);
            }
        }
        for (char letter: t.toCharArray()){
            if(tMap.containsKey(letter)){
                tMap.put(letter, tMap.get(letter)+1);
            }
            else{
            tMap.put(letter, 1);
            }
        }
        if(sMap.equals(tMap)){
            return true;
        }
        return false;
    }
}
