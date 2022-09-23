public class programmers_12916 {
    boolean solution(String s) {
        boolean answer = true;
        int count_p =0, count_y=0;
        s = s.toLowerCase();
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) == 'p') count_p++;
            if(s.charAt(i) == 'y') count_y++;
        }
        answer = count_p!= count_y? false : true;
        return answer;
    }
    public static void main(String[] args) {
        String a= "aPyy";
        programmers_12916 sol = new programmers_12916();

        System.out.println(sol.solution(a));

    }
}