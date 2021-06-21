import java.util.LinkedList;

public class Linkedlisted {
    public static void main(String[] args){
        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("Amit");
        ll1.add("Sarkar");
        ll1.add("Patvari");
        ll1.add("Anup");
        System.out.println(ll1);
        LinkedList<String> ll2 = new LinkedList<String>(ll1);
        ll2.add("Anup");
        ll2.add("Rahul");
        ll2.add("Ravi");
        System.out.println(ll2);
        System.out.println(".............................");

//        LinkedList Add Method
        ll2.addFirst("Reena");
        ll2.addLast("Rita");
        System.out.println(ll2);
        System.out.println(".............................");

//        LinkedList get Method
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(".............................");

//        LinkedList remove Method
        System.out.println(ll1);
        ll1.removeFirst();
        ll1.removeLast();
        System.out.println(ll1);

    }
}
