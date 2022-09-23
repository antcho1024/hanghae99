public class p_2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
        //++x : 1증가하고 뒤에 연산
        //y-- : 연산하고 1감소
        // 따라서 z = 11 + 20 = 31
    }
}
