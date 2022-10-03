import java.util.Scanner;

public class ejercicio1
{
	public static void main (String[] args)
	{
		/*System.out.println("Ejercicio 1: AGES");
		byte ageme, agefr, ages;
		float average;
		
		ageme = 35;
		agefr = 36;
		
		average = (float) (ageme+agefr)/2;
		System.out.println("Average is: "+average+"\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejercicio 2\nIntroduce tu fecha de nacimiento: ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int year = sc.nextInt();
		System.out.printf("Day %d, month %d and year %d\n", dia, mes, year);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ejercicio 3: GramOunceConverter\nIntroduce un peso en gramos: ");
		float pesog = Float.parseFloat(sc.nextLine());
		System.out.printf("El peso en onzas es: %f\n", pesog/28.3495);
	}
}
