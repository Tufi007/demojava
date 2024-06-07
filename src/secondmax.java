public class secondmax {
    public static void main(String[] args) {
        int[] a={8,1,4,5,66,7};
        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                smax=max;
                max=a[i];
            }else{
                if (a[i]>smax && a[i]!=max) {
                    smax=a[i];
                }
            }
        }
        System.out.println(smax);
    }
}
