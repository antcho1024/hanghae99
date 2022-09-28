import java.util.*;
public class Programmers_42889 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Float> hm = new HashMap<Integer, Float>();
        int bunmo =0;
        int cnt_sum =0;
        for(int i=1; i<N+1;i++ ){
            int cnt =0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]==i) cnt++;
            }
            bunmo = stages.length - cnt_sum;
            cnt_sum += cnt;
            if(bunmo ==0 ) hm.put(i,(float)0);
            else hm.put(i,(float)cnt/bunmo);
//            System.out.println(hm.get(i));
        }

        List<Integer> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1, o2) -> hm.get(o2).compareTo(hm.get(o1)));

        int i=0;
        for(Integer nKey : keySet){
            answer[i]=nKey;
            i++;
        }

        return answer;
    }
    public static void main(String[] args){
//        System.out.println(solution(10));
        int[] a = new int[]{1,1,1};
        int[] s = solution(3,a);
        for(int i =0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
