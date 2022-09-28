public class Programmers_12921 {
    public static boolean[] prime;
    public static int solution(int n) {
        int answer=0;
        prime = new boolean[n+1];
        prime[0] = prime[1] = true; // 소수 아님

        for(int i=2; i<Math.sqrt(n); i++){
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j= j+i) prime[j] = true;
        }
        for( int i=2; i<prime.length; i++) if(!prime[i]) answer++;

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
