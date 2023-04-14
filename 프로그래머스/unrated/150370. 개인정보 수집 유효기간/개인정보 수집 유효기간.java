import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        int todayYear = Integer.parseInt(today.split("\\.")[0]);
        int todayMonth = Integer.parseInt(today.split("\\.")[1]);
        int todayDay = Integer.parseInt(today.split("\\.")[2]);

        // 약관종류
        for (int i = 0; i <terms.length; i++) {
            map.put(terms[i].split(" ")[0],terms[i].split(" ")[1]);
        }

        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28;

            int num = (todayYear - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
                    + (todayMonth - Integer.parseInt(date.split("\\.")[1])) * 28
                    + (todayDay - Integer.parseInt(date.split("\\.")[2]));
            if(num >= type){
                list.add(i + 1);
            }
        }

        return list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
}