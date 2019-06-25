import java.util.Scanner;
import java.io.*;
public class Add {
    public static void addInt ( int n)
    {
        int n1, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values to add");
        for (int i = 0; i < n; i++) {
            n1 = in.nextInt();
            sum = sum + n1;
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        addInt(n);

    }
}
