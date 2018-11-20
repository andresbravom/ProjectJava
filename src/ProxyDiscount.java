import java.util.Scanner;

public class ProxyDiscount implements Discount {

	DiscountCode code = new DiscountCode();
	
	@Override
	public void reduction(Double n) {
		double total = Menu.printTotalProductsBuy(Menu.actualUser);
		String code;
		
		System.out.println("El código de dto es BlackFriday ");
		Scanner cod = new Scanner (System.in);
		code = cod.nextLine();
		
		if(code.equals("BlackFriday")) {
		
		System.out.println("Comprobando código de descuento" + n);
		
		n = total*n;
		total = total-n;
	
		System.out.println("El nuevo total es:"+ total);
		System.out.println("Su regalo será envuelto gratis");
		}else {
			System.out.println("El código introducido no es correcto");
		}
		
		
	}
	

}
