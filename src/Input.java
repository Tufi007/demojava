import java.util.Scanner;
// import java.util.scanner;
public class Input {
    public static void scan(){
        Scanner S = new Scanner(System.in) ;
            int a = S.nextInt();
            double b = S.nextDouble();
            String c = S.next();
            String d= S.nextLine();
            char e = d.charAt(0);
            System.out.println(a); 
            System.out.println(b); 
            System.out.println(c); 
            System.out.println(d); 
            System.out.println(e);
        
        
    }
    public static void main(String args[]){
        scan();
    }
}
