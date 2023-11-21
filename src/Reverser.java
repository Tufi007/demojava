import java.util.Scanner;

public class Reverser {

    public static void main(String[] args) {
        a();
    }
    public static void a(){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int rev=0;
        while (n>0) 
        {
         int d= n%10;
         
         rev= (rev*10)+d;
         n=n/10;   
        }
        System.out.println(rev);
    }
}