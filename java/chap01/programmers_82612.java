public class programmers_82612 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long _money = (long)money;
        for(int i =1; i<= count; i++){
            _money -= price*i;
        }
//        System.out.println(money);
        if(_money <0) answer = _money *-1;
        else answer =0;
        return answer;
    }

    public static void main(String[] args) {
        int a=3;
        int b=20;
        int c=4;
//        int[][] b = new int[][] {{3,4},{5,6}};
        programmers_82612 sol = new programmers_82612();
        sol.solution(a,b,c);
    }
}