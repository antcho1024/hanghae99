import java.util.Arrays;

public class programmers_12910 {
    public int[] solution(int[] arr, int divisor) {
        int j=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                arr[j]=arr[i];
                j++;
            }
        }
        if(j==0)
        {
            int[] answer = new int[1];
            answer[0]= -1;
            return answer;
        }
        int[] answer = new int[j];

        for(int i =0;i<j;i++){
            answer[i]=arr[i];
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int a=1;
        int b=20;
        int c=4;
        int[] arr = new int[] {2,36,1,3};

//        int[][] b = new int[][] {{3,4},{5,6}};
        programmers_12910 sol = new programmers_12910();
        arr = sol.solution(arr,a);
        for(int i=0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}