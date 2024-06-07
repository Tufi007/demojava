public class bubblesort {
    public static void main(String[] args){
        int arr[]={18,2,3,6,8,9,1,12};
        bubblesortarra(arr);
        bubblesortarrb(arr);
    }
    private static void bubblesortarra(int[] arr){
        for(int i=arr.length;i>=0;i--){
            for (int index = 1; index < i; index++) {
                if(arr[index]<arr[index-1]){
                    int temp=arr[index-1];
                    arr[index-1]=arr[index];
                    arr[index]=temp;
                }
            }
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        
    }
    private static void bubblesortarrb(int[] arr){
        for(int i=arr.length;i>=0;i--){
            for (int index = 1; index < i; index++) {
                if(arr[index]>arr[index-1]){
                    int temp=arr[index];
                    arr[index]=arr[index-1];
                    arr[index-1]=temp;
                }
            }
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        
    }
    
}
