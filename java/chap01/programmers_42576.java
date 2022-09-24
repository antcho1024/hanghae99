import java.util.Arrays;

public class programmers_42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(;i<completion.length; i++){
            if(!participant[i].equals(completion[i])) break;
        }

        return participant[i];
    }
    public static void main(String[] args){
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        programmers_42576 sol = new programmers_42576();
        System.out.println(sol.solution(a,b));
    }
}
