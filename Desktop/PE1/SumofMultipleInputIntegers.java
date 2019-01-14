import java.util.Scanner;



public class SumofMultipleInputIntegers {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner s = new Scanner(System.in);
        try {

            while (s.hasNextInt()) {
                num = s.nextInt();
                sum += num;
            }
            System.out.println(sum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error:format not accepted");}
        }

    }


