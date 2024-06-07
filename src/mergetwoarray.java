public class mergetwoarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={3,4,5,6,7,8,9};
        int[]arr3= new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]) {
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            if (arr1[i]>arr2[j]) {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            if (arr1[i]==arr2[j]) {
                arr3[k]=arr1[i];
                k++;
                arr3[k]=arr2[j];
                k++;
                j++;
                i++;
            }
            
        }
        while (i<arr1.length) {
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while (j<arr2.length) {
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        
        for (int index = 0; index < arr3.length; index++) {
            System.out.println(arr3[index]);
        }
    }
}
