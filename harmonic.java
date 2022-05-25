
import java.util.*;

public class harmoinc {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
         int n;
        double sum=0.0;
        System.out.println("Enter n value : ");
         n= s.nextInt();

        while(n>0)
        {
            sum+=(1.0)/n;
            n--;
        }

        System.out.println("harmonic sum is"+sum);
    }
}