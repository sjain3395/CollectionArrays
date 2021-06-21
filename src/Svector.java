import java.util.Vector;

public class Svector {
    public static void main(String[] args){
//        Vector<String> v = new Vector<String>(20);
//        System.out.println(v.capacity());
//        System.out.println(v);
        Vector<Integer> v = new Vector<Integer>();
        System.out.println(v.capacity());
        for( int i=0; i<=11; i++){
            v.add(i);

        }
        System.out.println(v.capacity());
        for( int i=12; i<=21; i++){
            v.add(i);

        }
        System.out.println(v.capacity());
        for( int i=22; i<=41; i++){
            v.add(i);

        }
        System.out.println(v.capacity());


    }
}
