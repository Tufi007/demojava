public class insertationsort {
    public static void main(String[] args) {
        int[]arr={4,5,6,3,2,9,88,0,1,3};
        
            // unsorted array
            for (int index = 1; index < arr.length; index++) {
                int ce= arr[index];
                sort(arr,index,ce);
            }
            
        
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        
    }

    private static void sort(int[] arr,int i,int ce) {
        // for (int j = i-1; j >=0; j--) {
        //     if(ce<=arr[j]){

        //         arr[j+1]=arr[j];

        //         // break;
        //     }
        //     arr[j+1]=ce;}
int j=i-1;
while (j>=0 && arr[j]>ce) {
    arr[j+1]=arr[j];
    j--;
}
arr[j+1]=ce;

            // if(ce<arr[j]){
            //     int temp=arr[j];
            //     arr[j]=arr[j-1];
            //     arr[j+1]=temp;
            // }
        }
    }

