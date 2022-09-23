public class p_1 {
    public static void main(String[] args) {
        double var1 = 5; //var1 = 5.0
        double var2 = 2; //var2 = 2.0
        double var3 = var1 / var2; //var1 var2가 만약 int라면 2.5를 내림해서 2가 되고 더블선언을해서 2.0이된다. var1,2를 double선언하고 계산을해 2.5로만듬
        int var4 = (int)(var3 * var2) ; // 2.5*2는 5.0이나오는데 기대값을 5.0이아닌 5를원했으므로 5로바꾸기위해 int를 사용한다
        System.out.println(var4);
    }
}