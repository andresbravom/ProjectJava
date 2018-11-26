import java.util.Scanner;

public class Currency {
	
	public void currencyExchange() {
	
		double currency, total;
		String euro, dolar;
		
		System.out.println("Enter the amount you want to change: ");
		System.out.println("------------------------------------");
		Scanner n = new Scanner(System.in);
		currency = n.nextDouble();
		
		System.out.println("\nChoose a change option: ");
		System.out.println("\n1. From Euros to Dollars");
		System.out.println("2. From Dollars to Euros");
		Scanner option = new Scanner(System.in);
		String opcion = option.nextLine();

		if(opcion.equals("1")) {
			total = currency * 1.13;
			System.out.println("The total is: " + total + "$");
		}else {
			total = currency / 1.13;
			System.out.println("The total is: " + total + "€");
		}	

	}

}