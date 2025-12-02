class Solution {
    public String solution(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            sb.append(b[i]);
        }
        return sb.toString();
    }
}