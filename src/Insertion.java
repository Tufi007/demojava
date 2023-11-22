public class Insertion {
    public static void main(String[] args) {
        int[] a={2,3,4,9,8,7};
        insertion(a);
    }

    private static void insertion(int[] a) {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            while (j>=0 && a[j]>temp) {
                a[j+1]=a[j];
                j--;  
            }
            a[j+1]=temp;
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
