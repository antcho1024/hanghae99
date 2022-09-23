import java.util.Scanner;
public class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        if(a==b) return a;
        else if (a>b) {
            long tmp = a;
            a= b;
            b= tmp;
        }
        for(long i = a; i<=b ; i++){
            answer +=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Solution sol = new Solution();
        System.out.println(sol.solution(a,b));

    }
}