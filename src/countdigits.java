public class countdigits {
    public static void main(String[] args) {
        int num=9237;
        String d="";
        int total=noofdigits(num, d);
        

System.out.println(total);
System.err.println(d);
    }

    private static int noofdigits(int num,String d) {

       if(num/10==0){    
        d=(String)d+num; 
        System.out.println(d);
        return 1;

       }
     int dig=num%10;
       d=(String)d+dig;
    int small=noofdigits(num/10,d);
    int big=1+small;
    return big;
       
    }
}
