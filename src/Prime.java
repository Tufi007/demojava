import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if (i==j) {
                    System.out.println(i);
                } else {
                    if (i%j==0) {
                        break;
                    }
                }
            }
        }
    }
}