import java.util.Scanner;

public class Currency {
	
	public void currencyExchange() {
	
		double moneda, total;
		String euro, dolar;
		
		System.out.println("Introducir la cantidad que desea cambiar: ");
		Scanner n = new Scanner(System.in);
		moneda = n.nextDouble();
		
		System.out.println("Elija una opción de cambio");
		System.out.println("\n1. De Euros a Dolares");
		System.out.println("2. De Dólares a Euros");
		Scanner option = new Scanner(System.in);
		String opcion = option.nextLine();

		if(opcion.equals("1")) {
			total = moneda * 1.13;
			System.out.println("El total es: " + total + "$");
		}else {
			total = moneda / 1.13;
			System.out.println("El total es: " + total + "€");
		}	

	}

}