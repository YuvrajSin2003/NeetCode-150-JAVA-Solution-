class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;

            int[] ch = new int[26];

            for(int i = 0 ; i<sl ; i++){
                ch[s.charAt(i) - 'a']++;
                ch[t.charAt(i) - 'a']--;
            }
            for(int c : ch){
                if(c != 0){
                    return false;
                }
            }
            return true;

        }
}
