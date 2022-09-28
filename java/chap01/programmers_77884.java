public class programmers_77884 {
    public int divisor_count(int n){
        int cnt=0;
        for(int i=1; i<n+1; i++) if(n%i==0) cnt++;
        return cnt;
    }
    public boolean OddEven(int n){
        if(n%2==0) return true;
        return false;
    }
    public int solution(int left, int right) {
        int answer = 0;

        for(int i= left; i<right+1; i++){
            if(OddEven(divisor_count(i))) answer +=i;
            else answer-=i;
        }
        return answer;
    }
}
