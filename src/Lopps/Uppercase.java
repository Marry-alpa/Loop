package Lopps;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        str = sc.nextLine();

        System.out.println(str.toUpperCase());
        String agrum;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to continue? (y/n)");
            agrum = scan.nextLine();

            if (agrum.equals("y")) {
                String str1;
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter your string");
                str1 = sc2.nextLine();

                System.out.println(str1.toUpperCase());
            }
        }while (!agrum.equals("n"));

    }
}
