import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Constructors {
    public static void main(String[] args){
        ArrayList a1 = new ArrayList ();
        a1.add("Anup");
        a1.add("Ravi");
        a1.add("Neeraj");
        a1.add("Summit");
        a1.add("John");
        a1.add("David");
        System.out.println(a1);
        HashSet<String> hs = new HashSet<String>();
        hs.add("Anup");
        hs.add("Ravi");
        hs.add("Neeraj");
        hs.add("Summit");
        hs.add("John");
        hs.add("David");

        System.out.println(hs);
        ArrayList<String> a2 = new ArrayList<String>(hs);
        a2.add("Patvari");
        a2.add("Sarkar");
        a2.add("Anil");
        System.out.println(a2);
        System.out.println(".................");


        a1.add(10);
        System.out.println(a1);

    }

}
