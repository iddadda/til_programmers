class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] var1 = str1.split("");
        String[] var2 = str2.split("");
        int len = str1.length();
        
        for(int i = 0; i < len; i++) {
            answer += var1[i] + var2[i];
        }
        return answer;
    }
}