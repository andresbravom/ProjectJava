import java.util.Scanner;

public class ProxyDiscount implements Discount {

	DiscountCode code = new DiscountCode();
	
	@Override
	public void reduction(Double n) {
		
		System.out.println("\n------------------------------------");
		double total = ProductsBought.printTotalProductsBuy(User.actualUser);
		
		System.out.println("\nApplying the discount of: " + n + "%");
		
		n = total * n;
		total = total - n;
	
		System.out.println("\nTnotal of your purchase: "+ total);	
		
	}
}
