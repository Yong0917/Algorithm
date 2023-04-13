import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String answer2 = Integer.toString(n);
        String[] answer3 = answer2.split("");
        for (int i = 0; i < answer3.length; i++) {
            answer += Integer.parseInt(answer3[i]);
        }
        return answer;
    }
}