import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arList = new ArrayList<>();
         
        int value = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                arList.add(arr[i]);
                value = arr[i];
            }
        }
        return arList.stream().mapToInt(i->i).toArray();
    }
}