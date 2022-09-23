public class programmers_12922 {
    public String solution(int n) {
        String answer = "";
        for(int i =0; i<n;i++){
            if(i%2==0) answer += '수';
            else answer += '박';
        }
        return answer;
    }
    public static void main(String[] args) {
        programmers_12922 sol = new programmers_12922();

        System.out.println(sol.solution(4));
    }
}