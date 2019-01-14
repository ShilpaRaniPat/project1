import java.util.Scanner;



public class Replication {
    public static void main(String[] args) {
        int n;
        //capturing the value of n//
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number n:");
        //the entered value is stored in var n//
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);

            }

        }
    }
}
