class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String[] array = s.toLowerCase().split(""); 
        
        for (int i = 0; i < array.length; i++) {
            if("p".equals(array[i])){
                pCount += 1;
            }
            if("y".equals(array[i])){
                yCount += 1;
            }
        }
        if(pCount != yCount){
            answer = false;
        }

        return answer;
    }
}