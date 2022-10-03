import java.util.Scanner;

enum month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULE, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

};

public class MonthEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        month input;
        String input_management;
        boolean salida = false;

        do {
            System.out.println("Introduce un mes: ");
            input_management = sc.nextLine().toUpperCase();

            // Comprueba que el mes introducido es correcto. Util como función.
            for (int i = 0; i < month.values().length; i++) {
                if (input_management.equals(month.values()[0].toString()))
                    salida = true;
            }
            if (!salida)
                System.out.println("Mes incorrecto");

        } while (!salida);

        input = month.valueOf(input_management);

        switch (input) {
            case FEBRUARY:
                System.out.println("Tiene 28 días.");
                break;
            case JANUARY:
            case MARCH:
            case MAY:
            case AUGUST:
            case JULE:
            case OCTOBER:
            case DECEMBER:
                System.out.println("Tiene 31 días.");
                break;
            default:
                System.out.println("Tiene 30 días");
        }

    }

}
