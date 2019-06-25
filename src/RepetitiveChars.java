import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RepetitiveChars {
    public static void repetitiveChar ()
    {
        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String str = input.nextLine();
        int len = str.length();
        System.out.println("enter a number below or equal to " + len);
        int n = input.nextInt();
        System.out.print(str);
        for (i = 1; i <= n; i++) {
            for (j = len - n; j <= len - 1; j++) {

                System.out.print(str.charAt(j));
            }
        }
    }

    public static void main(String[]args) {
        repetitiveChar();
           }

}
