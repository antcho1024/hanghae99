import java.util.Scanner;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int a=0;
        int len = s.length();
        a=len/2;
        if(len%2==0)
        {
            answer = s.substring(a-1,a+1);
        }
        else {
            answer = s.substring(a,a+1)
;       }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution sol = new Solution();
        System.out.println(sol.solution(str));

    }
}