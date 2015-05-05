/**
 * HelloWorld is a class to show hello world
 * @author takashi iguchi
 *
 */
public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!"); // comment
        // comment
        // variable
        int x = 5;
        System.out.println(x);
        // datatype
        String a = "hello\nworld\tworld2\\";
        String b = "world";
        System.out.println(a+b);

        int age = 2;
        if (age > 20) {
            System.out.println("otona!");
        } else {
            System.out.println("kodomo!");
        }
        String message;
        message = (age > 10) ? "otona" : "kodomo";
        System.out.println(message);

        int n = 2;
        switch (n) {
            case 1:
                System.out.println("one");
                break;
            case 2:
            case 3:
                System.out.println("Two or Three");
                break;
            default:
                System.out.println("default");
                break;
        }
        int m = 0;
        while (m < 10) {
            m++;
            if ( m % 2 == 0){
                continue;
            }
            System.out.println(m);
        }
        for (int l = 0; l < 10; l++) {
            if (l == 5){
                break;
            }
            System.out.println(l);
        }
        int sales[]; // 宣言
        sales = new int[4]; //領域の確保
        sales[0] = 150;
        sales[1] = 200;
        sales[2] = 140;
        sales[3] = 400;
        // sales.length; //領域の個数
        for (int o = 0; o < sales.length; o++){
            System.out.println(sales[o]);
        }
    }
}
