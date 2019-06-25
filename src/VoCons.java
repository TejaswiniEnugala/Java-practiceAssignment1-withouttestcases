import java.util.Scanner;
public class VoCons {
    public static void checkvowel ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String str = input.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("vowel");
            } else {
                System.out.println("consonent");
            }
        }

    }

    public static void main(String[]args) {
        checkvowel();
           }
}
