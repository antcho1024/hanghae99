public class programmers_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt_0=0, cnt_w=0;
        for(int i=0; i< lottos.length; i++){
            if(lottos[i]==0) cnt_0++;
            else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]) cnt_w++;
                }
            }
        }
        switch (cnt_w){
            case 2:
                cnt_w=5;
                break;
            case 3:
                cnt_w=4;
                break;
            case 4:
                cnt_w=3;
                break;
            case 5:
                cnt_w=2;
                break;
            case 6:
                cnt_w=1;
                break;
            default:
                cnt_w=6;
                break;
        }
        if(cnt_0==6) cnt_0--;

        int[] answer = new int[] {cnt_w-cnt_0, cnt_w};
        return answer;
    }
    public static void main(String[] args){

    }
}
