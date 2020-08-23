public class LeftShift {
    public static void main(String args[]) {
        int a = 2;
        int b = 1;
        for( int i = 0 ; i < 10 ; i++) {
            a = a << b;
            System.out.println(a);
        }
    }
}