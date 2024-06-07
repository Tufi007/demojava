public class replacecharrecur {
    public static void main(String[] args) {
        String s="ababaac";
        System.out.println(replace(s,'x'));
    }

    private static String replace(String s, char c) {
        // TODO Auto-generated method stub
        if (s.length()==0) {
            return s;
        }
    
        String small=replace(s.substring(1), c);
        if (s.charAt(0)=='a') {
            return 'x'+small;
        }
        else{
            return s.charAt(0)+small;
        }
    }
}
