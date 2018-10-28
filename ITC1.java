
import java.util.Scanner;
public class ITC1 {

    public static void main(String[] args) {
    	Scanner lector = new Scanner(System.in);
    	System.out.print("Introduzca el año: ");
        int a = lector.nextInt();
 
        if (a%400==0) {
            System.out.println("El año " + a + " es bisiesto.");
        } else if ((a%100==0) && (a%4==0)) {
            System.out.println ("El año " + a + " no es bisiesto.");
        
    }
}
}