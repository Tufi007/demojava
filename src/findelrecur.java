public class findelrecur {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int l=a.length-1;
        int el=9;
        System.out.println(findel(a,l,el));
    }

    private static boolean findel(int[] a, int l,int el) {
        // TODO Auto-generated method stub
      if(a[l]==el){
        return true;
      }
      if (l==0) {
        return false;
      }
      boolean small=findel(a, l-1, el);
      return small;

    }
}
