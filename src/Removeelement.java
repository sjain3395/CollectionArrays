import java.awt.*;
import java.util.ArrayList;

public class Removeelement {
    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Anup");
        a1.add("Ravi");
        a1.add("Neeraj");
        a1.add("Summit");
        System.out.println(a1);
        System.out.println(a1.remove("Anup"));
        System.out.println(a1.remove("Ankit"));
        System.out.println(a1);
        System.out.println(".........................");
        ArrayList<String>a2 = new ArrayList<String>();
        a2.add("Anup");
        a2.add("Summit");
        System.out.println(a2);
        System.out.println(".........................");
        System.out.println(a1.removeAll(a2));
        System.out.println(a1);
        System.out.println(".........................");
        System.out.println(a1.contains("Ravi"));
        System.out.println(a1.contains("Anup"));
        System.out.println(a1);

    }
}
