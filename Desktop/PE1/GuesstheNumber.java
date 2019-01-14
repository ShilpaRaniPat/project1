import java.util.Scanner;

public class GuesstheNumber { public static void main(String[] args) {
    int n;
    int target_no = 32;
    int flag=0;
    while(flag==0){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value between 1 to 50: ");
        //the entered value is stored in var n//
        n=s.nextInt();
        if (n >=1 && n<=50) {
            if (n > target_no) {
                System.out.println(" Number guessed is more than the original number");
            } else if (n < target_no) {
                System.out.println(" Number guessed is more than the original number");

            } else {
                System.out.println(" Number guessed is the same as original number");
                flag++;

            }
        }
            else {
                System.out.println("Invalid number, please provide the number between the range");

            }
        }
    }
}


