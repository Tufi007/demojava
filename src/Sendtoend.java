public class Sendtoend {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 0, 0, 0, 1 };
        zeroend(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void zeroend(int[] a) {
        int n=a.length;
        for (int i = 0, j=0; i < n;i++) {
            if (a[i]!=0) {
                int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
            }
            }
        }
    }


