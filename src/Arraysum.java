public class Arraysum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5}, b={10,2,3,4,5,6,7};
        int x= Math.max(a.length, b.length);
        int[] sum=new int[x+1];
        sumarray(a,b,sum);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    public static void sumarray(int[] a, int[] b,int[] sum) {
     int i=a.length -1;
     int j=b.length -1;
     int k= sum.length-1;
     int c=0;
     while (i>=0 && j>=0) {
        int Sum= a[i]+b[j]+c;
        sum[k]=Sum%10;
        c=Sum/10;
        k--;
        i--;
        j--;
     }
     while (i>=0) {
        int Sum= a[i]+c;
        sum[k]=Sum%10;
        c=Sum/10;
        k--;
        i--;
        
     }
     while (j>=0) {
        int Sum= b[j]+c;
        sum[k]=Sum%10;
        c=Sum/10;
        k--;
        j--;
     }
     sum[0]=c;
    }
}
