public class Programmers_17681 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        String[] answer = new String[n];
        for(int i=0; i< n; i++){
            StringBuilder tmp = new StringBuilder();
            while(arr1[i]>0){
                if(arr1[i]%2==0) tmp.append('0');
                else  tmp.append('1');
                arr1[i] /=2;
            }
            tmp.reverse();
            int r0 = n- tmp.length();
            s1[i] = "0".repeat(r0) + tmp;
        }
        for(int i=0; i< n; i++){
            StringBuilder tmp = new StringBuilder();
            while(arr2[i]>0){
                if(arr2[i]%2==0) tmp.append('0');
                else  tmp.append('1');
                arr2[i] /=2;
            }
            tmp.reverse();
            int r0 = n- tmp.length();
            s2[i] = "0".repeat(r0) + tmp;
        }

        for(int i=0; i<n; i++){
            StringBuilder tmp = new StringBuilder();
            for(int j=0; j<n ; j++){
                if(s1[i].charAt(j)=='1'||s2[i].charAt(j)=='1') tmp.append('#');
                else tmp.append(' ');
            }
            answer[i] = tmp.toString();
        }

        for(int i=0; i< n; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }
    public static void main(String[] args){
        int[] a1 = new int[] {9, 20, 28, 18, 11};
        int[] a2 = new int[] {30, 1, 21, 17, 28};
        solution(5,a1,a2);
    }
}
