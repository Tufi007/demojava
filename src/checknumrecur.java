public class checknumrecur {
    public static void main(String[] args) {
        int[] a={1,2,3,7,8,5,44,5,44,66};
        int l=0;
        int x=44;
        System.out.println(checkinrec(a,l,x));
    }

    private static int checkinrec(int[] a,int l,int x) {
        // TODO Auto-generated method stub
        if(l==a.length-1){
            return -1;
        }
        if(a[l]==x){
            return l+1;
        }
        int res=checkinrec(a, l+1, x);
        return res;
    }
}
