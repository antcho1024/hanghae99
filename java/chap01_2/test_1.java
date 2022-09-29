import java.util.ArrayList;
import java.util.List;

public class test_1 {
    public int solution(int[] arr1) {
        List<Integer> intList = new ArrayList<>();
        for (int element : arr1) intList.add(element);
        List<Integer> ab = new ArrayList<>();
        for(int i=0; i<10; i++){
            if(!intList.contains(i)) {
                ab.add(i);
            }
        }

        int answer = 0;
        for(int i= ab.get(0); i<ab.get(1)+1; i++){
            answer+=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        test_1 method = new test_1();
        int[] arr1 = {1,3,5,9,2,4,8,0};
        System.out.println(method.solution(arr1));
    }
}