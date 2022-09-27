import java.security.spec.RSAOtherPrimeInfo;

public class programmers_12943 {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        while (n != 1) {
            if(n%2==0) n /=2;
            else n = n*3 + 1;
            answer++;
            if(answer >=500) return -1;
        }
        return answer;
    }
    public static void main(String[] args){
        programmers_12943 sol = new programmers_12943();
        System.out.println(sol.solution(626331));
    }
}
