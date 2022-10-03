import java.util.Scanner;

public class GramOunceConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight;
        String unit;

        System.out.println("Introduce un peso en gramos(g) o en onzas(o). Añade la letra separada por un espacio:");
        weight = sc.nextFloat();
        unit = sc.nextLine();

        switch (unit.charAt(1)) {
            case 'g':
                System.out.printf("Son %.4f onzas\n", weight * 0.035274);
                break;
            case 'o':
                System.out.printf("Son %.4f gramos\n", weight * 28.3495);
                break;
            default:
                System.out.println("Unidad no válida\n");
        }
    }
}