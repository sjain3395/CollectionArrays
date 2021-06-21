import java.util.Stack;

public class Studentstack {
    public static void main(String[] args){
        Stack<String> s = new Stack<String>();
        s.push("Amit");
        s.push("Naveen");
        s.push("Reema");
        s.push("Rita");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search("Amit"));
        System.out.println(s.search("Reema"));
        System.out.println(s.search("Rita"));
        System.out.println(s);





    }

}
