
public class Sort {
    public static void main(String[] args) {
        int[] a={2,6,3,8,9,0};
        sort(a);
        
    }

    private static void sort(int[] a) {
for (int i = 0; i < a.length-1; i++) {
    for (int j = i+1; j < a.length; j++) {
        if (a[j]<=a[i])  {
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    
    
}
for (int j = 0; j < a.length; j++) {
        System.out.println(a[j]);
    }
    }
}
