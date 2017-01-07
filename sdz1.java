package projet1;

import java.util.Scanner;

public class sdz1 {

	private static Scanner sc;

	public static void main(String[] args) {
		double Celsius;
		double Fahrenheit;
		System.out.println("Bienvenue");
		Scanner reponse1 = new Scanner(System.in);
		char reponse = 'O';
		while (reponse == 'O')
		{
			
		System.out.println("Choisir le mode de conversion");
		System.out.println("1 : Conversion Celsius - Fahrenheit");
		System.out.println("2 : Conversion Fahrenheit - Celsius");
		sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1){
			System.out.println("Entrez votre temperature");
			Scanner temparature = new Scanner(System.in);
			int temperature = sc.nextInt();
			Fahrenheit = (1.8*temperature) + 32.00;
			System.out.println(temperature + " correspond à " +Fahrenheit+"F");
			System.out.println("Tu veux faire un autre conversion ? O/N");
			reponse = reponse1.nextLine().charAt(0);
		}else if (i == 2)
		{
			System.out.println("Entrez votre temperature");
			Scanner temparature = new Scanner(System.in);
			int temperature = sc.nextInt();
			Celsius = ((temperature-32)/1.8000);
			System.out.println(temperature + " correspond à " +Celsius+"C");
			System.out.println("Tu veux faire un autre conversion ? O/N");
			reponse = reponse1.nextLine().charAt(0);
		}
		}
		if (reponse == 'N'){
			System.out.println("Aurevoir");
		}
	}

}
