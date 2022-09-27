public class programmers_12906 {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
         //동적 배열 쓰면 되는구나..
        int tmp=-1;
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(tmp != arr[i]){
                tmp = arr[i];
                answer[j] = arr[i];
                j++;
            }
        }
        int[] _answer = new int[j];
        for(int i=0; i< j; i++){
            _answer[i]=answer[i];
        }
        return _answer;
    }
    public static void main(String[] args){
        programmers_12906 sol = new programmers_12906();
        int[] a = new int[] {1,1,3,3,0,1,1};

        System.out.println(sol.solution(a));
    }
}
