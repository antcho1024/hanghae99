public class programmers_12930 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                cnt = 0;
            } else {
                if (cnt % 2 == 0) answer += Character.toUpperCase(s.charAt(i));
                else answer += Character.toLowerCase(s.charAt(i));
                cnt++;
            }

        }

        return answer;
    }
    public static void main(String[] args){
        String a ="try hello  world";
        programmers_12930 sol = new programmers_12930();
        System.out.println(sol.solution(a));
    }
}
