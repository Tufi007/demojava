public class arrayrotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int s=2;
        int r=arr.length;
        int l=0;

        rotate(arr,l,r);
        // rotateright(arr, l, r,s);
        rotateleft(s,l,arr,r);
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
           }
    }

    private static void rotateleft(int s, int l, int[] arr,int r) {
        // TODO Auto-generated method stub
        rotate(arr, l, r-s);
        rotate(arr, r-s, r);
    }

    private static void rotateright(int[] arr, int l, int r, int s) {
        rotate(arr, l, s);
        rotate(arr,s,r);
        // TODO Auto-generated method stub
    }

    private static void rotate(int[] arr,int l , int r) {
        // TODO Auto-generated method stub
        r--;
        int totallen=(r-l)/2;

       for (int i = 0; i <=totallen; i++) {
        swap(arr,l,r);
        l++;
        r--;
       }
      
}

    private static void swap(int[] arr, int l, int r) {
        // TODO Auto-generated method stub
        int temp= arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
    }}
