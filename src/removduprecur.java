public class removduprecur {
    public static void main(String[] args) {
        String s="aaabbcddde";
        System.out.println(remdup(s));
    }

    private static String remdup(String s) {
        System.out.println(s);
     if(s.length()==1){
        return s;
     }
     String small= remdup(s.substring(1));
     System.out.println(small);
     if (s.charAt(0)==small.charAt(0)) {
        System.out.println(small);
        return small;
     }else{
        return s.charAt(0)+small;
     }
    }
}
