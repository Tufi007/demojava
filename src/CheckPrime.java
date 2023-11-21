import java.util.Scanner;

public class CheckPrime{
 public static void a(){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int i=2;
    boolean isprime =true;
    while (i<= a-1) {
        if (a%i == 0) {
            isprime =  false;
            // System.out.println("hello");
        }
        i=i+1;
    }
    System.out.println(isprime);
 }
 public static void main(String[] args) {
    a();
 }
}
