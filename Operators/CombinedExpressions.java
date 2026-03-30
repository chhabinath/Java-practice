public class CombinedExpressions {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int result = x++ * --y + y++ / x--;
        System.out.println(result);
		System.out.println(x+" "+y);
		System.out.println(4/11);
		System.out.println(10*4+4/11);
    }
}
