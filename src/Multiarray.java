public class Multiarray {
    public static void main(String[] args){
        int [][] a ={{10,20,30,40},{40,50,60,70},{50,60,70,80},{30,40,50,60}};
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][2]);
        System.out.println(a[3][3]);
        System.out.println(a[a.length-1][a[0].length-2]);
        System.out.println("..............................");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();


    }

}


