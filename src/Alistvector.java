import java.util.ArrayList;
import java.util.Vector;

public class Alistvector {
    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Anup");
        a1.add("Ravi");
        a1.add("Neeraj");
        a1.add("Summit");
        a1.add("John");
        System.out.println(a1);
        Vector<String> v = new Vector<String>(a1);
        System.out.println(v);

    }
}
