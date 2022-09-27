public class programmers_12935 {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = new int[1];
            answer[0]=-1;
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int min_index =0;
        for(int i=0;i<arr.length; i++){
            if(arr[min_index]>arr[i]) min_index =i;
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(min_index==i) continue;
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }
    public static void main(String[] args){
        programmers_12935 sol = new programmers_12935();

    }
}
