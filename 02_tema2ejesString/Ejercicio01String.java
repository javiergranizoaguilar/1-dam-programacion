package ejercicio01.string;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio01String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dame la frase");
        String a=new Scanner(System.in).nextLine();
        String b=a.trim();
        int d=a.indexOf(b);
        String e=a.substring(d);
    System.out.println(e);
    }
    
}
