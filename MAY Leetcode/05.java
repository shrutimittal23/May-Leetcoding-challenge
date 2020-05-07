class Solution {
    public int firstUniqChar(String s) {
          
        int[] countArray = new int[26];
        char[] array = s.toCharArray();
         
        for(int i=0; i<array.length; i++){            
            countArray[array[i]-'a']++;
        }
         
        for(int i=0; i<array.length; i++){
            if(countArray[array[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}