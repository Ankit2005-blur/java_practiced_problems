import java.util.*;
import java.text.*;

public class currecyformat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        
       Locale india=new Locale("en" ,"IN");
        NumberFormat i=NumberFormat.getCurrencyInstance(india);
        
        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: " +us.format(payment));
        System.out.println("India: " +i.format(payment));
        System.out.println("China: " + c.format(payment));
        System.out.println("France: " + f.format(payment));
        scanner.close();
    }
}