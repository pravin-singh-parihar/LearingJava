package basic;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        //Using a class Scanner we can get an input from the user .Scanner class is a predfine class
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("a="+a);

    }
}
