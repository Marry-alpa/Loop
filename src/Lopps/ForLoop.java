package Lopps;

public class ForLoop {
    public static void main(String[] args) {
        int n =10;
        int i, j;

        //increment
        for (i=1; i<n+1; i++){
            System.out.println(i);
        }
        System.out.println("------------------");
        //decrement
        for (i=n; i>1; i--){
            System.out.println(i);
        }

        //Line
        for (i=1; i<2; i++){
            for (j=0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println(System.lineSeparator());
        }

        System.out.print("---------------");
        System.out.println(" ");
        //Rectangle
        for (i=1;i<10;i++){
            for (j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println(System.lineSeparator());
        }
        System.out.print("---------------");
        System.out.println(" ");

        //Triangle
        for (i=1; i<=n; i++){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(System.lineSeparator());
        }

    }
}
