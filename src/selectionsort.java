import java.util.Scanner;

public class selectionsort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the size of string");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements for array");
        int genarr[] = genarray(arr);
       
        int ind=-1;
        for (int i = 0;i < (genarr.length-1);i++) {

             int max= Integer.MIN_VALUE;
            for(int j= i;j<genarr.length; j++){
                if(genarr[j]>max){
                max=genarr[j];
                ind= j;
                // System.out.println(max);
            }
            int temp=genarr[i];
            genarr[i]=max;
            genarr[ind]=temp;
            
            

            
        } 
        }
       printarray(genarr);

    }

    public static int[] genarray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.printf("the element for index %d", i);
            int e = s.nextInt();
            arr[i] = e;
            i++;
        }
        return arr;

    }

    public static void printarray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.printf("the element for index %d is %d \n", index, arr[index]);

        }
    }
}
