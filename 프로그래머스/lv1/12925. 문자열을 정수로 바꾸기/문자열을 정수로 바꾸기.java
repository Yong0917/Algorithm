class Solution {
    public int solution(String s) {
        String a = String.valueOf(s.charAt(0));
        if(a.equals("-")){
            return Integer.parseInt(s.substring(1)) - Integer.parseInt(s.substring(1)) * 2;
        } else{
            return Integer.parseInt(s);
        }
    }
}