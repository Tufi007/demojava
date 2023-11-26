public class Mergesort {
    public static void main(String[] args) {
        int[]a={2,3,4};
        int [] b ={4,5,6,7};
        int c[]= sort(a,b);
        for (int i = 0; i < c.length; i++) {
            System.err.println(c[i]);
        }
    }

    private static int[] sort(int[] a, int[] b) {
        int m= a.length;
        int n= b.length;
        int [] c= new int[m+n];
        int i =0 , j =0, k = 0,p=c.length;
        while (i<m && j<n ) {
            if (a[i] <= b[j]) {
                c[k]=a[i];
                k++;
                i++;

            } else {
                c[k]=b[j];
                j++;
                k++;
            }
            while (i<m) {
                c[k]=a[i];
                i++;
                k++;
            }
            while (j<n) {
                c[k]=b[j];
                j++;
                k++;
            }
            
        }
        return c;
    }
}
