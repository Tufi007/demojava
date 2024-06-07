public class printnrecurs {
    public static void main(String[] args) {
        int n=18;
        printn(n);
    }

    private static void printn(int n) {
        // TODO Auto-generated method stub
        if( n==0){
            return ;
        }
        //  System.out.println(n);
        printn(n-1);
       System.err.println(n);
    }
    }
