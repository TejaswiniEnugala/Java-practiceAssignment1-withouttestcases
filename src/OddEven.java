import java.util.Scanner;
public class OddEven {
    public static void checkOddEven ( int n)
    {
        if (n > 20 & n < 30) {
            if (n % 2 != 0) {
                System.out.println("TOM");
            } else {
                System.out.println("Jerry");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number between 20 and 30");
        int n = input.nextInt();
        checkOddEven(n);

    }
}
