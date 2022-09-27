import java.util.ArrayList;
import java.util.List;

public class programmers_42840 {
    public List<Integer> solution(int[] answers) {
        int[] stu_1 = new int[] {1, 2, 3, 4, 5};
        int[] stu_2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu_3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt_1=0, cnt_2=0, cnt_3=0;
        for(int i=0; i<answers.length; i++) if(stu_1[i%5] == answers[i]) cnt_1++;
        for(int i=0; i<answers.length; i++) if(stu_2[i%8] == answers[i]) cnt_2++;
        for(int i=0; i<answers.length; i++) if(stu_3[i%10] == answers[i]) cnt_3++;
        int max_score = Math.max(cnt_1, Math.max(cnt_2,cnt_3));

        List<Integer> answer = new ArrayList<>();
        if(max_score == cnt_1) answer.add(1);
        if(max_score == cnt_2) answer.add(2);
        if(max_score == cnt_3) answer.add(3);

        return answer;
    }
    public static void main(String[] args){
        programmers_42840 sol = new programmers_42840();
        int[] a = new int[] {1,3,2,4,2};

        System.out.println(sol.solution(a));

    }
}
