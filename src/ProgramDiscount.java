import java.util.Scanner;

public class ProgramDiscount {

	public static void discountAndrewCode(Double n) {
		
	Discount discount = null;
	
	try {
		System.out.println("Introducir el código de descuento");
		Scanner c = new Scanner(System.in);
		String cd = c.nextLine();
		
		if(cd.equals("123")) {
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