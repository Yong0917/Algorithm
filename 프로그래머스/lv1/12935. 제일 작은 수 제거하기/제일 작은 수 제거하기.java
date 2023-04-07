import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        } else{
            int[] temp = arr.clone();
            answer = new int[arr.length - 1];

            Arrays.sort(temp);
            int minVal = temp[0];

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(minVal != arr[i]){
                    list.add(arr[i]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}