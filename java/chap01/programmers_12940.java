import java.util.Stack;

public class programmers_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        Stack<Integer> CommonFactor = new Stack<>();
        //최대 공약수
        for(int i=1; i<Math.min(n,m)+1; i++) if(n%i==0 && m%i==0) CommonFactor.add(i);
        answer[0] = CommonFactor.peek();
        CommonFactor.clear();
        //최소 공배수
        for(int i =n*m; i>=Math.min(n,m); i--) if(i%n==0 && i%m==0) CommonFactor.add(i);
        answer[1] = CommonFactor.peek();
        return answer;
    }
}
