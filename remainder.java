
import java.util.*;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print 
                ("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("quotient of " +num1+"divided by"+num2+"is:"
                +(num1/num2)+"\nremainder of "+num1+"divided by "+num2+"is:"+(num1%num2));
    }
}