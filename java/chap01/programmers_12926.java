public class programmers_12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            int m =n;
            char c = sb.charAt(i);
            if(c ==' ') continue;
            if(m+(int)c>122){
                m = m - (122-(int)c) - 1;
                c = 'a';
            } else if ((int)c<91&&90-(int)c < m) {
                m = m - (90-(int)c) - 1;
                c = 'A';
            }
            c = (char)((int)c+m);
            sb.setCharAt(i,c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        programmers_12926 sol = new programmers_12926();
        System.out.println(sol.solution("AaZz", 25));
    }
}
