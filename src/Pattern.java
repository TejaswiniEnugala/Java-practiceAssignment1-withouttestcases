import java.util.Scanner;
public class Pattern {

    public static void print(int n) {
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();

        print(n);
    }
}

