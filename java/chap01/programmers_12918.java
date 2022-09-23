import java.util.Arrays;

public class programmers_12918 {
    public boolean solution(String s) {
        if(s.length()==4||s.length()==6) {
            for(int i=0;i<s.length();i++) if(s.charAt(i)>'9'||s.charAt(i)<'0') return false;
            return true;
        }else return false;

    }
    public static void main(String[] args) {
        String a= "1234";
        programmers_12918 sol = new programmers_12918();

        System.out.println(sol.solution(a));

    }
}