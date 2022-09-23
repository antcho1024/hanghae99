import java.util.Arrays;

public class programmers_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i < a.length; i++){
            answer = answer + a[i]*b[i];
        }
        return answer;
    }
    public static void main(String[] args) {
    }
}