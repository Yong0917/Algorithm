import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(i -> i).sorted().toArray();
        }
        return answer;
    }
}