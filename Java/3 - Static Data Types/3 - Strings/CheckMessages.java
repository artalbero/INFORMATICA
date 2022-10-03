import java.util.Scanner;

public class CheckMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = new String[10];
        String[] salida = new String[10];
        String aux;
        String text = "Hello world";
        String result = text.replace("Hello", "Good morning");
        System.out.println(result);

        System.out.println("Introduce 10 cadenas de texto: ");
        for (int i = 0; i < entrada.length; i++) {
            System.out.printf("%d: ", i + 1);
            entrada[i] = sc.nextLine();
            aux = entrada[i];
            // Replace All solo funciona devolviendo el valor, pero no lo cambia en el
            // original
            salida[i] = aux.replaceAll("Eclipse", "IntelliJ");

        }
        for (int i = 0; i < salida.length; i++)
            System.out.println(salida[i]);

    }
}
