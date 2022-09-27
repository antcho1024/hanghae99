public class programmers_86491 {
    public int solution(int[][] sizes) {
        int[][] tmp = new int[sizes.length][2];

        for (int i=0;i<sizes.length; i++){
            tmp[i][0] = Math.max(sizes[i][0],sizes[i][1]);
            tmp[i][1] = Math.min(sizes[i][0],sizes[i][1]);
        }
        int max_w=0, max_h=0;

        for(int i =0; i<sizes.length; i++){
            if(max_w < tmp[i][0]) max_w = tmp[i][0];
            if(max_h < tmp[i][1]) max_h = tmp[i][1];
        }

        //겁나 깔끔..
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
        return max_w*max_h;
    }
    public static void main(String[] args){
        programmers_86491 sol = new programmers_86491();
//        System.out.println(sol.solution(125));
    }
}
