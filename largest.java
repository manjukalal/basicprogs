

import java.util.*;
public class largestnum {
    public static void main(String[] args) {
        int largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        System.out.print( "Enter the thired number");
        int c= sc.nextInt();

         if(a>b && a>c)
            largest=a;
       else  if(b>a && b>c)
            largest=b;
       else
           largest=c;
        System.out.print("largest number is" +largest);

    }
}
