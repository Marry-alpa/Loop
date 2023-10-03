package Lopps;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int x = rd.nextInt(100);

        System.out.println("Welcome to game 'Guess the number'");
        System.out.println("Enter your first number:");

        int num = in.nextInt();
        while (num != x){
            if (num>x){
                System.out.println("Too big");
            }else {
                System.out.println("Too small");
            }
            num = in.nextInt();
        }
        System.out.println("Excellent!");
    }
}