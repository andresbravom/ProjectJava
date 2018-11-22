import java.util.Scanner;

public class DiscountCode implements Discount{

	@Override
	public void reduction(Double n) {
		
		double total = Main.printTotalProductsBuy(Main.actualUser);
	
		System.out.println("Aplicando el descuento del: " + n + "%");
		n = total*n;
		total = total-n;
	
		System.out.println("El nuevo total es: "+ total);	
		System.out.println("Su regalo será envuelto gratis");
		
	}	
	
}
