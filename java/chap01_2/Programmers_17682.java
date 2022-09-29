//import java.util.ArrayList;
//import java.util.List;
//
//public class Programmers_17682 {
//    public int solution(String dartResult) {
//        List<Integer> score = new ArrayList<>();
//
//        for(int i=0; i<dartResult.length(); i +=2){
//            char c= dartResult.charAt(i);
//            if(c =='*'){
//                int l = score.size();
//                score.set(l-1, score.get(l-1)*(2));
//                if(l-2>-1){
//                    score.set(l-2, score.get(l-2)*(2));
//                }
//                i--;
//                continue;
//            } else if (c == '#') {
//                int l = score.size();
//                score.set(l-1, score.get(l-1)*(-1));
//                i--;
//                continue;
//            }
//            int tmp = Integer.parseInt(c+"");
//
//            c= dartResult.charAt(i+1);
//            if(c =='S') score.add(tmp);
//            else if (c=='D') score.add(tmp * tmp);
//            else if (c=='T') score.add(tmp * tmp * tmp);
//            else System.out.println("오류");
//        }
//        int answer = 0;
//
//        for(int i=0; i<score.size(); i++){
//            answer+=score.get(i);
//        }
//        return answer;
//    }
//}
