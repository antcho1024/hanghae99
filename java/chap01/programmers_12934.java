public class programmers_12934 {
    public long solution(long n) {
        double tmp = Math.sqrt(n);
        if(tmp%1==0){
            return ((long)tmp+1)*((long)tmp+1);
        }
        return -1;
    }
    public static void main(String[] args){

    }
}
