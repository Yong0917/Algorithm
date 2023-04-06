import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Long> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            array.add((long) nums[i]);
        }
        long[] array2 = array.stream().mapToLong(i -> i).distinct().toArray();
        if(array2.length >= nums.length/2){
            answer = nums.length/2;
        } else{
            answer = array2.length;
        }
        return answer;
    }
}