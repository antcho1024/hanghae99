import java.util.Scanner;

public class Hello {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer ="Even";
        }
        else{
            answer ="Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Hello hello = new Hello();
        System.out.println(hello.solution(num));

    }
}