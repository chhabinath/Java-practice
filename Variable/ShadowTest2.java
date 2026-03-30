public class ShadowTest2 {
    static int x = 50;
    public static void main(String[] args) {
        int x = 100;
        {
            int y = 200;
            System.out.println(y);
        }
        System.out.println(x);
        System.out.println(ShadowTest2.x);
    }
}
