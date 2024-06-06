import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        int a[]= new int[4];
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int s= 0,e=arr.length-1;
        System.out.println(s+","+e);
        Scanner f= new Scanner(System.in);
        int fin= f.nextInt();
        if(fin>=arr[0] && fin<=arr[e]){
        while(s<=e || e>=s){
            int m=(e+s)/2;
            if (arr[m]== fin) {
                
                System.out.println("element is at" + (m+1));
                break;
            } else {
                if (arr[m]>fin) {
                    e=m-1;
                }
                else{
                    if(arr[m]<fin){
                        s=m+1;
                    }
                }
            }
        }}else{
            System.out.println("outofbonds");
        }
    }
}
