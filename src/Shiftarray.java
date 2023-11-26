import java.util.Scanner;

public class Shiftarray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println("write the no shifts and dir ");
        Scanner s = new Scanner(System.in);
        int shift = s.nextInt();
        shift=shift%n;
        System.out.println("dir is");
        String dir =  "right";
        if (shift > 0 && dir.equals("left")) {
            leftshift(arr, shift, n);
        }
        else{if (shift > 0 && dir.equals("right")) {
            rightshift(arr, shift, n);
            
        }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rightshift(int[] arr, int shift, int n) {
        reversearray(arr, 0, n);
        reversearray(arr, 0, shift);
        reversearray(arr, shift, n);
    }

    public static void reversearray(int[] arr, int shift, int n) {
        int l=0;
        int r=n;
        while (l<r) {
            doshift(arr,l,r);
            l++;
            r--;
            
        }

    }
    public static void doshift(int[] arr, int l, int r) {
    r--;
        int temp= arr[l];
        arr[l]=arr[r];
        arr[r]=temp;}

    

    public static void leftshift(int[] arr, int shift, int n) {
        reversearray(arr, 0, n);
        reversearray(arr, n - shift, n);
        reversearray(arr, 0, n - shift);
    }
}
