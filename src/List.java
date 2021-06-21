import java.util.ArrayList;

public class List {
    public static void main(String[] args)
    {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Anup");
        a1.add("Ravi");
        a1.add("Neeraj");
        a1.add("Summit");
        a1.add("John");
        a1.add("David");
        System.out.println(a1);
//        a1.add(7, "Shidhu"); java.util.ArrayList.rangeCheckForAdd
        a1.add(6 ,"Shidhu");
        System.out.println(a1);
        System.out.println("......................");
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Nitin");
        a2.add("Ramesh");
        System.out.println(a2);
        System.out.println("......................");

        a1.addAll(2 ,a2);
        System.out.println(a1);
        System.out.println(".................");


//      a1.set(10, "Anup"); Index 10 out of bounds for length 9
        a1.set ( 2 ,"Sarkar" );
        System.out.println(a1);
        System.out.println("......................");

        System.out.println(a1);
        System.out.println(a1.get(2));
        System.out.println(a1.get(8));
        System.out.println("......................");

        System.out.println(a1);
        System.out.println(a1.remove(2));
        System.out.println(a1.remove(4));
        System.out.println(a1);
        System.out.println("......................");

        System.out.println(a1);
        System.out.println(a1.indexOf("Anup"));
        System.out.println(a1.lastIndexOf("Shidhu"));
















    }
}
