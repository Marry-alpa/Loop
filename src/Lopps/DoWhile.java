package Lopps;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 10;
        do{
            System.out.println("Left " + counter + " sec");
            counter--;
        }while (counter>0);
    }
}
