import java.util.Scanner;

public class ChecktheNatureOfInput {
    public static void main(String[] args) {
        char input_char;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number n:");
        input_char = s.next().charAt(0);
        if(input_char >=65 && input_char <=90)
        {
            System.out.println("Capital Letter");
        }
        else if(input_char >=97 && input_char <=122){
            System.out.println("Small Letter");


        }
        else if(input_char >=48 && input_char <=57){
            System.out.println("Digit");


        }
        else {
            System.out.println("Special symbol");
        }


    }
}
