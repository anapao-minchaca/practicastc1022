import java.util.Scanner;
public class ITC2 {
	
	public static void main(String[] args) {
    	Scanner lector = new Scanner(System.in);
    	System.out.print("Introduzca el número: ");
        int n = lector.nextInt();
        int i;
        int suma = 0;

        for (i=1; i<n; i++) {
        	if (n%i==0) {
        		suma = suma + i; 
        	}
        }

        if (suma == n) {
        	System.out.println("El número es perfecto.");
        } else { 
          System.out.println("El número no es perfecto.");
        }
}
}