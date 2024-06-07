public class stringrotate {
    public static void main(String[] args) {
        String s="taufeeq";
        String sr="";
        // for (int index = s.length()-1; index >=0 ; index--) {
        //     sr+=s.charAt(index);
        // }
        for (int index = 0; index < s.length(); index++) {
            sr=s.charAt(index)+sr;
        
        }
        for (int index = 0; index < sr.length(); index++) {
            System.out.println(sr.charAt(index));
        }
    }
}
