public class pushxero {
    public static void main(String[] args) {
        int[]arr = {1,0,3,0,6,0,0,0};
        int j=0;
        int ce;
        int i=0;
        while (i<arr.length) {
            if (arr[i]!=0) {
                ce=arr[i];
                arr[i]=arr[j];
                arr[j]=ce;
                  j++;
                i++;
            }
               i++; 
            }
        
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
