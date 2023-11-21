import java.util.Scanner;

public class CheckingChar {
    public static void a(){
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if (Character.isLowerCase(a)) {
            System.out.println("lowercase");
        } else {
            if (Character.isUpperCase(a)) {
                System.out.println("uppercase");
            }
            else{
                System.out.println("not an alphabet");
            }
        }
    } 
    public static void main(String[] args) {
        a();
    }

}
