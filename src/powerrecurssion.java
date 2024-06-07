/**
 * powerrecurssion
 */
public class powerrecurssion {

    public static void main(String[] args) {
        int res= recpow(2,5);
        System.err.println("the answer is"+res);
    }

    private static int recpow(int i, int j) {
        if(i==0){
            return 0;
        }
        if(j==0){
            return 1;
        }
        int small= recpow(i, j-1);
        int ans= i*small;
        return ans;
    }
}