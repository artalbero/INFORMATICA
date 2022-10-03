
//LispChecker. En este caso, el programa comprueba que todos los paréntesis abiertos se cierren
import java.util.Scanner;

public class LispChecker {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instruccion;
        int num_ap = 0;
        int num_ci = 0;

        boolean instruccion_correcta = true;

        System.out.println("Introduce una instrucción: ");
        instruccion = sc.nextLine();

        // En el momento en el que haya más cierres que aperturas, se sale del bucle
        for (int i = 0; i < instruccion.length() && instruccion_correcta; i++) {

            if (instruccion.charAt(i) == '(')
                num_ap++;
            else if (instruccion.charAt(i) == ')')
                num_ci++;
            // Se comprueba que no haya más cierres que aperturas
            if ((num_ap - num_ci) < 0)
                instruccion_correcta = false;
        }

        // se comprueba que no haya distinto número de cierres y aperturas (para ver que
        // no haya más aperturas que cierres)
        if (num_ap - num_ci != 0)
            instruccion_correcta = false;
        if (instruccion_correcta)
            System.out.println("Instrucción correcta");
        else
            System.out.println("Instrucción incorrecta.");

    }

}