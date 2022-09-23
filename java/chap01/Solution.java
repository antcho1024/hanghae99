import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n;i++){

            answer[i] = (long)x + i*(long)x;
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int a=0;
        int n=2;
//        int[][] b = new int[][] {{3,4},{5,6}};
        Solution sol = new Solution();
        sol.solution(a,n);
    }
}