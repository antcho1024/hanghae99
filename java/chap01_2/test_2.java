public class test_2 {
    public String solution(String s) {
        StringBuilder tmp = new StringBuilder();
        int cnt =0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)==' ') {
                tmp.append(' ');
                continue;
            }

            if(cnt%2==0) tmp.append(Character.toUpperCase(s.charAt(i)));
            else tmp.append(Character.toLowerCase(s.charAt(i)));
            cnt++;
        }
        String answer = tmp.toString();
        return answer;
    }

    public static void main(String[] args) {
        test_2 method = new test_2();
        String s ="hang hae ninety nine";
        System.out.println(method.solution(s));
    }
}