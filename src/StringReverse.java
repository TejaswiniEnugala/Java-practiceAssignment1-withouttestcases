import java.util.Scanner;
public class StringReverse {
    public static void reverse ()
    {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverse();
        }
}
