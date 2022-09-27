public class programmers_68935 {
    public int solution(int n) {
        double answer = 0;
        long tmp=0;
        while (n>0){
            tmp = tmp*10 + n%3;
            n/=3;
        }
        int i=0;
        System.out.println(tmp);
        while(tmp>0){
            answer += (tmp%10)*Math.pow(3,i);
            i++;
            tmp /=10;
        }

        return (int)answer;
    }
    public static void main(String[] args){
        programmers_68935 sol = new programmers_68935();
        System.out.println(sol.solution(125));
    }
}
