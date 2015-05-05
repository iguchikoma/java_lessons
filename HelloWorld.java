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

    }
}
// testing comment
// testing comment
// testing comment
