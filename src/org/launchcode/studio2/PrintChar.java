package org.launchcode.studio2;

import java.util.Scanner;

public class PrintChar {
    public static void main(String[] args) {
        String sentence ;
        char c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string :");
        sentence=scanner.nextLine();
//        System.out.println("Enter a character: ");
//        c=scanner.next().charAt(0);
 CountChar count =new CountChar();
 count.countCharacters(sentence);



    }
}
