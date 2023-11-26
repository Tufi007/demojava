public class Negativefirst {
    public static void main(String[] args) {
        int[] a={2,7,9,4,7,-1,-3,5,-9};
        negfirst(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void negfirst(int[] a) {
    for (int i = 0,j=0; i < a.length; i++) {
        if (a[i]<0) {
            int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
        }
    }
    }
}
