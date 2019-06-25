import java.util.Scanner;
public class GuessNumber {
    public static  void guess(){
        int m=51;
    System.out.println("enter a number between 1 to 100 ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
        if (n > 1 && n < 100) {
            if (n == m) {
                System.out.println("number guessed matches the original number");

            } else if (n > m) {
                System.out.println("number is greater than original number");
            } else if (n < m) {
                System.out.println("number is smaller than original number");
            }
        }
    }
    public static void main(String[]args) {
        guess();
    }
}
