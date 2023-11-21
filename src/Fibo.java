import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        a();
    }
    public static void a() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  fn1, fn2;
        int fn=0;
        fn1 = 0;
        fn2 = 1;
        int i=1;
        for (i =1; i < n; i++) {
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
            
            

        }
        System.out.println(fn);
    }

}