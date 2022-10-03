import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_entrada, suma, numero_digitos, aux;
        suma = 0;
        System.out.println("Introduce números para sumar. Se suman cuando introduces 0:");
        do {
            numero_entrada = sc.nextInt();
            suma += numero_entrada;

        } while (numero_entrada != 0);

        System.out.printf("La suma es: %d\n", suma);
        aux = suma;
        numero_digitos = 0;
        while (aux > 0) {
            aux /= 10;
            numero_digitos++;
        }
        System.out.printf("El número de dígitos es: %d\n", numero_digitos);
    }

}
