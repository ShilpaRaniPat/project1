import java.util.Scanner;

public class Repeatation {
    public static void main(String[] args) {
        String text;
        int last;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");
        text =s.nextLine();
        System.out.println("Enter the value of the last character you want to repeat:");
        last=s.nextInt();
        String numbers=text.substring(text.length() - last, text.length());
        System.out.println(text);
        for (int i=0;i<last;i++){
            System.out.println(numbers);
        }




    }
}
