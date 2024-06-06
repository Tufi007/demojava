public class pallindrome {
    public static void main(String[] args) {
        String s="abbaba";
        int i=s.length()-1;
        int j=0;
        for (int index = 0; index < s.length()/2; index++) {
            while (j!=i) {
                
                if (s.charAt(i)!=s.charAt(j)) {
                    System.out.println("not pallendrome");
                }
                j++;
                i--;
            }
            
        }
    }
}
