
public class arraysum {
    public static void main(String[] args) {
        int [] arr1={2,3,4,5,6};
        int [] arr2={0,3,5,88,1,33,0,2};
        int i=arr1.length-1;
        int j=arr2.length-1;
        int max= Math.max(arr1.length,arr2.length);
        // max+=1;
        int[] arr3=new int[max+1];
        int carry=0;
        while (i >=0 && j>=0) {
            int sum= arr1[i]+ arr2[j]+carry;
            arr3[max]= sum%10;
            carry=sum/10;
            i--;
            j--;
            max--;
        }
        while (i>=0) {
            int sum = arr1[i]+carry;
            arr3[max]=sum%10;
            carry=sum/10;
            i--;
            max--;
        }
        while(j>=0){
            int sum= arr2[j]+carry;
            arr3[max]=sum%10;
            carry=sum/10;
            j--;
            max--;
        }
    arr3[max]=carry;
        for (int index = 0; index < arr3.length; index++) {
            System.out.print(arr3[index]+" ");
        }
}
}