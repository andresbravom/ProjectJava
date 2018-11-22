import java.util.Scanner;

public class DiscountCode implements Discount{

	@Override
	public void reduction(Double n) {
		
		double total = Main.printTotalProductsBuy(Main.actualUser);
	
		System.out.println("Applying the discount of: " + n + "%");
		n = total*n;
		total = total-n;
	
		System.out.println("Total of your purchase: "+ total);	
		System.out.println("Your gift will be wrapped for free");
		
	}	
	
}
