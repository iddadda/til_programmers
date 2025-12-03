class Solution {
    public int solution(int a, int b) {
        
        
        String str1 = a + "";
        String str2 = b + "";
        
        int solution1 = Integer.parseInt((str1 + str2));
        int solution2 = Integer.parseInt((str2 + str1));
        
        int answer = solution1 < solution2 ? solution2 : solution1 ;
        
        return answer;
    }
}