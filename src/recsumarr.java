public class recsumarr {
    public static void main(String[] args) {
        int []a={1,2,3};
        int l=a.length-1;
        System.out.println(psum(l,a));

    }

    private static int psum(int l, int[]a) {
        if (l==0) {
            return a[l];
        }
        int small= psum(l-1,a);
        int big =a[l]+small;
        return big;
}}
