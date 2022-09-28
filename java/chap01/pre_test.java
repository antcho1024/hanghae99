import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pre_test {
    public boolean is_prime(int number) {
        if(number < 2) return false;
        if(number == 2) return true;
        for(int i = 2; i < number; i++) if(number % i == 0) return false;
        return true;
    }
    public String solution(String[] arr) {

        List<Integer> prime = new ArrayList<>();
        List<Integer> non_prime = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(is_prime(num)) prime.add(num);
            else non_prime.add(num);
        }
        int prime_max = Collections.max(prime);
        int non_prime_min = Collections.min(non_prime);
        String answer =non_prime_min + " " + prime_max;
        return answer;
    }
    public static void main(String[] args){
//        Main method = new Main();
//        String[] s = {"97", "75", "88", "99", "95", "92", "73"};
//        System.out.println(method.solution(s));
    }
}
