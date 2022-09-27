import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class programmers_68644 {
    public Integer[] solution(int[] numbers) {
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                if(!tmp.contains(numbers[i]+numbers[j])) tmp.add(numbers[i]+numbers[j]);
            }
        }
        tmp.sort(Comparator.naturalOrder());
        Integer[] answer = tmp.toArray(new Integer[0]);
        return answer;
    }
    public static void main(String[] args){
        programmers_68644 sol = new programmers_68644();
        int[] a = new int[] {2,1,3,4,1};
        List<Integer> tmp = new ArrayList<>();
        tmp.add(5);
        tmp.add(1);
        tmp.add(3);
        tmp.add(4);
        tmp.sort(Comparator.naturalOrder());
//        System.out.println(tmp.contains(3));

//        System.out.println(sol.solution(a));
        Integer[] b =sol.solution(a);
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
