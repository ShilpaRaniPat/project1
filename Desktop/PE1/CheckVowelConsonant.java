
import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        int flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired string:");
        String str = input.nextLine();
        if(str.matches(".*\\d+.*")) {
            flag = 1;
        }
        if(flag==0) {
            char c;
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println(str.charAt(i) + " = Vowel");
                } else {
                    System.out.println(str.charAt(i) + " = Consonent");
                }
            }
        }
        else
            System.out.println("Invalid String");


    }
}

