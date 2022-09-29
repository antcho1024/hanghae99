import java.util.*;
public class test_3 {
    public String[] solution(String[] arr, int n) {
        int i=0;
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : arr) hm.put(s, hm.getOrDefault(s, 0) + 1);

        List<String> tmp = new ArrayList<>();
        for (String key : hm.keySet()) {
            if (hm.get(key) == 1){
                tmp.add(key);
            }
        }
        String[] strings = new String[tmp.size()];
        for(i=0; i<tmp.size(); i++){
            strings[i] = tmp.get(i);
        }

        ArrayList<String> list = new ArrayList<>();
        for(i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];

        for (i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        test_3 method = new test_3();
        String[] arr = {"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"};
        int n = 2;
        System.out.println(Arrays.toString(method.solution(arr, n)));
    }
}