class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        int mode = 0;
        int idx = 0;
        
//         문자열 -> 배열
        char[] arr = code.toCharArray();
        
        
//         "1"이면 mode 1로 변경하기
        for(idx = 0; idx < arr.length; idx++) {
            if(mode == 0) {
                if(arr[idx] != '1') {
                    ret += idx % 2 == 0 ? arr[idx] : "";
                } else {
                    mode = 1;    
                }
                
            } else {
                if(arr[idx] != '1') {
                    ret += idx % 2 == 1 ? arr[idx] : "";
                } else {
                    mode = 0;    
                }
                
            }
        }
        
        return "".equals(ret) ? "EMPTY" : ret ;
    }
}