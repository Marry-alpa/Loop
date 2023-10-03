package Lopps;

import java.util.Scanner;

public class FavorBook {
    public static void main(String[] args) {
        String name;
        int age;
        String favBook;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        name = sc.next();

        System.out.println("Your age, please: ");
        age = sc.nextInt();

        System.out.println("What is your favourite book? ");
        favBook = sc.next();

        System.out.println(name+ " for your age I can recommend: ");
        if (age >= 13 && age <= 16) {
            System.out.println("'Loving reaper' Jenny Jinya and 'The Chronicles of Narnia' John Ronald Reuel Tolkien");
        }else if (age<13){
            System.out.println("'Bad boys' Aaron Blaby");
        }
        if (age >= 17 && age <= 25) {
            System.out.println("'Trash of the count's family' Yoo Ryeo Han");
            System.out.println("'Lore Olympus' Rachel Smythe");
            System.out.println("'The subtle art of not giving a f**k: a counterintuitive approach to living a good life' Mark Menson");
        }
        if(age>25){
            System.out.println("'Loss of humanity' Dazai Osamu");
        }
        String agrum;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to continue? (y/n)");
            agrum = scan.nextLine();

            if (agrum.equals("y")) {
                Scanner sc1 = new Scanner(System.in);

                System.out.println("Please, enter your name: ");
                name = sc1.next();

                System.out.println("Your age, please: ");
                age = sc1.nextInt();

                System.out.println("What is your favourite book? ");
                favBook = sc1.next();

                System.out.println(name+ " for your age I can recommend: ");
                if (age>=13 && age <16) {
                    System.out.println("'Loving reaper' Jenny Jinya and 'The Chronicles of Narnia' John Ronald Reuel Tolkien");
                } else if (age<13) {
                    System.out.println("'Bad boys' Aaron Blaby");
                }
                if (age <= 25 && age >= 17) {
                    System.out.println("'Trash of the count's family' Yoo Ryeo Han");
                    System.out.println("'Lore Olympus' Rachel Smythe");
                    System.out.println("'The subtle art of not giving a f**k: a counterintuitive approach to living a good life' Mark Menson");
                }
                if(age>25){
                    System.out.println("'Loss of humanity' Dazai Osamu");
                }
            }
        } while (!agrum.equals("n")) ;
    }
}
