import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        System.out.println("value of length of array is");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = makeArray(n);
        // printSumArray(arr);
        // System.out.println(Array.arraysum(arr));
        System.out.println("the ma value is"+' '+Array.max(arr));

    }

    public static int max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a > max) {
                max = a;
            }

        }
        return max;
    }

    public static void printSumArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] makeArray(int n) {
        System.out.println("length of the array is" + n);
        Scanner s = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the " + i + "element of array");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int arraysum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }
}