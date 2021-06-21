import java.util.ArrayList;
import java.util.Objects;

public class Student {
    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Anup");
        a1.add("Ravi");
        a1.add("Neeraj");
        a1.add("Summit");
        a1.add("John");
        a1.add("David");
        System.out.println(a1);
        System.out.println(a1.size() );
        System.out.println("...............");
        System.out.println(a1);
        Object[] elements = a1.toArray();
        for ( Object obj : elements){
             System.out.println(obj);
            
        }
        System.out.println("...............");
        System.out.println(a1);
        a1.clear();
        System.out.println(a1.isEmpty());

        System.out.println(a1);

    }
}
