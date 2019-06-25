import java.util.Scanner;
public class Palindrome {
    public static void checkPalindrome() {
        int temp, r, sum = 0, add = 0,sum1=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        temp = n;
        while (n != 0) {
            r = n % 10;
            sum1=sum1+r;
            sum = r + sum * 10;
            n = n / 10;
            if (r % 2 == 0) {
                add = add + r;
            }
        }
        if (sum == temp) {
            if (sum1 > 25) {

                System.out.println(temp + " is a palindrome and sum of even numbers is greater than 25");
            } else {
                System.out.println(temp + " is a palindrome and sum of even numbers is less than 25");
            }
        } else {
            System.out.println(temp + " is not  a paindrome");
        }

    }


    public static void main(String[] args) {
        checkPalindrome();

    }
}
