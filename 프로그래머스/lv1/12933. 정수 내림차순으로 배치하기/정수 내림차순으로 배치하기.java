import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for (String a : str) {
            sb.append(a);
        }
        return Long.parseLong(String.valueOf(sb.reverse()));
    }
}