
    import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

    public class SortingplusSum {
        public static void main(String args[]) {
            int number;
            int sum=0;
            //For capturing the value of n
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value of n:");
            //The entered value is stored in the var n
            number = scanner.nextInt();
            int len = Integer.toString(number).length();
            Integer[] iarray = new Integer[len];
            for (int index = 0; index < len; index++) {
                iarray[index] = number % 10;
                number /= 10;
            }
            Arrays.sort(iarray, Collections.reverseOrder());
            System.out.print("Sorted number in non-increasing order : ");
            for(int i=0;i<iarray.length;i++)
            {
                int j=iarray[i];
                if(j%2==0)
                {
                    sum=sum+j;
                }
            }
            for(int i=0;i<iarray.length;i++)
            {
                System.out.print(23iarray[i]);
            }
            System.out.print("\n");
            System.out.println("Sum of Even Numbers : "+sum);
            if(sum>15)
                System.out.println("True");
            else
                System.out.println("False");


        }
    }

