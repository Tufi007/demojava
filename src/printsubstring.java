public class printsubstring {
    static String s="taufeeq";
    static int sum=0;
    public static void main(String[] args) {
        // for (int index = 0; index < s.length(); index++) {
        //     for (int i = index; i < s.length(); i++) {
        //         System.out.print(s.substring(index, i+1)+" ,");
        //         sum+=1;
        //     }
        // }
        for (int index = 1; index <=s.length(); index++) {
            for (int i= 0; i <= s.length()-index; i++) {
                System.err.print(s.substring(i,index+i)+" , ");
                sum+=1;
            }
        }
        System.err.println(sum);
    }
}
