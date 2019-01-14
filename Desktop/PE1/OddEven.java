import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        int n;
        //capturing the value of n//
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number n:");
        //the entered value is stored in var n//
        n=s.nextInt();

        if (n>20 && n<30){
            if (n%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }


        }
        else{
            System.out.println("Invalid input");
        }



    }
}
