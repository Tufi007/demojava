package classpkg;
public class tryclass {
   public  String name="taufeeq";
    public static void main(String[] args) {
        
        int rollno;
        tryclass t= new tryclass();
        System.out.println(t.name);
        t.hello();
    }
    public void hello(){
        System.out.println("checking"+this.name);
    }
    
}
