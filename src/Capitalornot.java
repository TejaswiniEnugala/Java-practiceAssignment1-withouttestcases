import java.util.Scanner;
public class Capitalornot {
    public static void check ( char ch)
    {
        if (ch >= 65 & ch <= 90) {
            System.out.println("Capital letter");

        } else if (ch >= 97 & ch <= 122) {
            System.out.println("smallcase letter");
        } else if (ch >= 48 & ch <= 57) {
            System.out.println("digit");
        } else if ((ch > 0 & ch <= 47) || (ch >= 58 & ch <= 64) || (ch >= 91 & ch <= 96) || (ch >= 123 & ch <= 127)) {
            System.out.println("special symbol");
        }
    }
    public static void main(String[]args) {
        System.out.println("enter the input");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        check(ch);

    }
}
