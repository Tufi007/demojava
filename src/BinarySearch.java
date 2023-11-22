import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("enter the elemnt you want to search");
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        int pos = binarySearch(a, e);
        if (pos != -1) {
            System.out.println(pos);
        } else {
            System.out.println("element not found or out of the bond");
        }

    }

    private static int binarySearch(int[] a, int e) {
        int l = a.length;
        int start, end, mid;
        start = 0;
        end = l - 1;

        int pos = -1;
        if (a[start] <= e && a[end] >= e) {
            do {
                mid = (start + end) / 2;
                if (a[mid] == e) {
                    pos = mid;
                    break;
                } else {
                    if (a[mid] < e) {
                        start = mid + 1;

                    } else {
                        if (a[mid] > e) {
                            end = mid - 1;

                        } else {
                            return pos = -1;

                        }
                    }
                }
            } while (start <= end || end <= start);
            
        } else {
            return pos;
        }

        return pos;
    }

}
