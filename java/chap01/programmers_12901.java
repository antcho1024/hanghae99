public class programmers_12901 {
    public String solution(int a, int b) {
        String answer = "";
        int sum =0;
        int day =0;
        switch (a){
            case 1: sum =0;
                    break;
            case 2: sum =31;
                break;
            case 3: sum =60;
                break;
            case 4: sum =91;
                break;
            case 5: sum =121;
                break;
            case 6: sum =152;
                break;
            case 7: sum =182;
                break;
            case 8: sum =213;
                break;
            case 9: sum =244;
                break;
            case 10: sum =274;
                break;
            case 11: sum =305;
                break;
            case 12: sum =335;
                break;
            default:
                break;
        }
        day = (sum + b)%7;
        switch (day){
            case 1: answer ="FRI";
                break;
            case 2: answer ="SAT";
                break;
            case 3: answer ="SUN";
                break;
            case 4: answer ="MON";
                break;
            case 5: answer ="TUE";
                break;
            case 6: answer ="WED";
                break;
            case 0: answer ="THU";
                break;

        }
        return answer;
    }

    public static void main(String[] args) {
        int a=5;
        int b=24;
//        int c=4;
//        int[][] b = new int[][] {{3,4},{5,6}};
        programmers_12901 sol = new programmers_12901();
        sol.solution(a,b);
    }
}
