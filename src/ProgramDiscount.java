import java.util.Scanner;

public class ProgramDiscount {

	public static void discountAndrewCode(Double n) {
		
	Discount discount = null;
	
	try {
		System.out.println("Is it the first time you buy at this store? Y/N");
		Scanner c = new Scanner(System.in);
		String cd = c.nextLine();
		
		if(cd.equals("y")|| cd.equals("Y")) {
			
			discount = new DiscountCode();
			
		}else {
		
			discount = new ProxyDiscount();
				
		}
		
	}catch(Exception e) {
		return;
	}
	discount.reduction(0.20);
	
	}

}