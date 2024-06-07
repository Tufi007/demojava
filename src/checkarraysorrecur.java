public class checkarraysorrecur {
    public static void main(String[] args) {
        int[]a={1,2,3,8,5,6};
        int l= a.length-1;
        System.out.println(checksort(a,l));
    }

    private static boolean checksort(int[] a, int l) {
        // TODO Auto-generated method stub
        if(l==1){
        return true;
       }
       if (a[1]<a[0]) {
        return false;
       }
      
       int[]small= new int[l-1];
       for (int i = 1; i < small.length; i++) {
         small[i-1]=a[i];
       }

       boolean res=checksort(small,l);
       return res;

    }
}
