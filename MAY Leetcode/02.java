class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if(J.length()==0){
            return 0;
        }
        for(int i =0;i<S.length();i++){
            for(int j =0;j<J.length();j++){
            char c = S.charAt(i);
            char s = J.charAt(j);
            if(c == s){
                count++;
            }
        }
        }
        return count;
    }
}