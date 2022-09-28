public class programmers_12977 {
    public boolean is_prime(int number) {
        if(number < 2) return false;
        if(number == 2) return true;
        for(int i = 2; i < number; i++) if(number % i == 0) return false;
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length; j++ ){
                for(int l=j+1; l<nums.length; l++){
                    if(is_prime(nums[i]+nums[j]+nums[l])) answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){

    }
}
