public class programmers_12947 {
    public boolean solution(int x) {
        int n = x;
        int d=0;
        while (n>0){
            d = d + n%10;
            n/=10;
        }

        return x%d==0;
    }
    public static void main(String[] args){
        programmers_12947 sol = new programmers_12947();
        System.out.println(sol.solution(13));
    }
}
