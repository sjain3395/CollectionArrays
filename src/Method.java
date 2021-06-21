import java.awt.*;
import java.util.HashSet;

public class Method {
    public static void main(String[] args){
//        HashSet<String> hs = new HashSet<String>();
//        System.out.println(hs.add("Anup"));
//        System.out.println(hs.add("Anup"));

        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("Anup");
        hs1.add("Ravi");
        hs1.add("Neeraj");
        hs1.add("Summit");
        System.out.println(hs1);
        HashSet<String> hs2 = new HashSet<String>();
        System.out.println(hs2.addAll(hs1));
        System.out.println(hs2.addAll(hs1));
        hs2.add("Anup");
        hs2.add("Sarkar");
        System.out.println(hs1);


    }
}
