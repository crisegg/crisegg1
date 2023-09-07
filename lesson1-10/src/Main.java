public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 255;
        byte b = (byte) a;
        System.out.println(b);
        byte c = 127;
        byte d = 127;
        System.out.println(c + d);

        char f = 10;
        int e = f;
        System.out.println(e);
        if (a > c && c > f) {
            System.out.println("a最大");
        } else if (a > c && c < f)
            System.out.println("c最小");
        else if (a < c && c < f) {
            System.out.println("f最大");
            System.out.print("a最小");
        } else if (a < c && c > f)
            System.out.println("c最大");

        for (int i = 0; i < 200; i++){
            if(a%c==0) {
                System.out.println(a + "/t" + "是" + c + "的" + (a /c )+ "倍");

            }
            a++;
        }


    }}