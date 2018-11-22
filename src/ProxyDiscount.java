import java.util.Scanner;

public class ProxyDiscount implements Discount {

	DiscountCode code = new DiscountCode();
	
	@Override
	public void reduction(Double n) {
		double total = ProductsBought.printTotalProductsBuy(User.actualUser);
		
		System.out.println("Applying the discount of: " + n + "%");
		
		n = total*n;
		total = total-n;
	
		System.out.println("Total of your purchase: "+ total);	
		
	}
}
