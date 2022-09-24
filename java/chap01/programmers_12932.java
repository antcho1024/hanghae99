public class programmers_12932 {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        int i=0;
        while(n!=0){
            long tmp = n%10;
            answer[i]=(int)tmp;
            n/=10;
            i++;
        }
        return answer;
    }
    public static void main(String[] args){
        programmers_12932 sol = new programmers_12932();
        int[] a =sol.solution(12345);
        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
