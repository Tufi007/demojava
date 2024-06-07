public class lastindrec {
    public static void main(String[] args) {
        int[] a={1,2,3,2,4,5,6,7};
        int l= a.length-1;
        int x=2;
        System.out.println(checknumlastrecur(a,l,x));
    }

    private static int checknumlastrecur(int[] a, int l, int x) {
        // TODO Auto-generated method stub
        if(l==0){
            return -1;
        }
        if(a[l]==x){
            return l+1;
        }
        int res=checknumlastrecur(a, l-1, x);
        return res;
    }
}
