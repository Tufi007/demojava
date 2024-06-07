public class fiborec {
    public static void main(String[] args) {
        int n=4;
        int res=fibo(n);
        System.out.println(res);
    }

    private static int fibo(int n) {
        // TODO Auto-generated method stub
        if(n==1 || n==0){
            return 1 ;
        }
        int f1= fibo(n-1);
        
        int f2=fibo(n-2);
        return f1+f2;

    }
}
