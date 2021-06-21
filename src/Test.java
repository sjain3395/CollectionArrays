public class Test {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(a);
        System.out.println(a[4]);
        System.out.println(a[3]);
        System.out.println(a[2]);
        System.out.println(a[1]);
        System.out.println(a.length);
        System.out.println(a[a.length - 2]);
        System.out.println("/............................../");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("/............................../");
        for (int x : a) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("/............................../");
        int i = 0;
        while (i < a.length) {
            System.out.println(a[i]);
            i = i + 1;
        }


        System.out.println();
        System.out.println("/............................../");
        int j = 0;
        do {
            System.out.println(a[j]);
            j = j+1;
        }
        while (j < a.length);


    }
}
