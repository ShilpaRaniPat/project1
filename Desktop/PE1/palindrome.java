import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class palindrome
    {
        public static void main(String[] args) {
            int sum = 0,r,n;
            int e;
            int temp;


            Scanner s = new Scanner(System.in);
            System.out.println("Enter the desired number:");
            n = s.nextInt();
            //putting the input number into a temporary variable//
            temp = n;



            while (n >0) {
                r = n % 10;
                sum = sum * 10 + r;
                //decreasing the state//
                n = n / 10;
            }
            //comaring the values//
            if (temp == sum) {
                e=0;
                while(temp>0){
                    if((temp%10)%2==0)
                        e=e+temp%10;
                    temp=temp/10;

                }
                if(e>25){
                    System.out.println("Output is palindrome and is greater than 25");
                }
                else{
                    System.out.println("output is palindrome and is less than 25");
                }


                    }
            else{
                System.out.println("output is not palindrome");
            }
                }

}
