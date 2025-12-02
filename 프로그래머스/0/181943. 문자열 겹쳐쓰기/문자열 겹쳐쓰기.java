class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] str1 = my_string.toCharArray();
        char[] str2 = overwrite_string.toCharArray();
        
        int len = str2.length+1;
        int idx = 0;
        
        for(int i = 0; i < str2.length; i++){
            str1[s] = str2[i];
            s++;
        }
        
       for(char digit : str1) {
           answer += digit;
       }
        
        return answer;
    }
}