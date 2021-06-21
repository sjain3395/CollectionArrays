import java.util.Vector;

public class Methodsvector
{
    public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        v.add("Anup");
        v.add("Rahul");
        v.add("Naman");
        v.add("Patvari");
        System.out.println(v);

//        addElement Method
        v.addElement("Sarkar");
        v.addElement("Amit");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

//       boolean removeElement Method
        System.out.println(v.removeElement("Anup"));
        System.out.println(v.removeElement("Anup"));
        System.out.println(v);

        v.removeElementAt(3);
        System.out.println(v);




    }

}
