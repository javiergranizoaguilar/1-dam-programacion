package practica02t4;
import objeto.FichaDomino;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Practica02t4 {

    public static void main(String[] args) {

        FichaDomino f1 = new FichaDomino(6,1);
        FichaDomino f2 = new FichaDomino(0,4);
        FichaDomino f3 = new FichaDomino(3,3);
        FichaDomino f4 = new FichaDomino(0,1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
    }

}