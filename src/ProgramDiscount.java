import java.util.Scanner;

public class ProgramDiscount {

	public static void discountAndrewCode(Double n) {
		
	Discount discount = null;
	
	try {
		System.out.println("¿Es la primera vez que compra en esta tienda? S/N");
		Scanner c = new Scanner(System.in);
		String cd = c.nextLine();
		
		if(cd.equals("s")|| cd.equals("S")) {
			/*System.out.println("El código de descuento es: BLACK");
			System.out.println("Introduzca el código: ");
			Scanner cod1 = new Scanner (System.in);
			if(cod1.equals("Black")) {*/
				discount = new DiscountCode();
			/*}else {
				System.out.println("Código incorrecto");
			}*/
		}else {
			/*System.out.println("El código de descuento es: BLACK");
			System.out.println("Introduzca el código: ");
			Scanner cod1 = new Scanner (System.in);
			if(cod1.equals("Black")) {*/
				discount = new ProxyDiscount();
			/*}else {
				System.out.println("Código incorrecto");
			}*/	
		}
		
	}catch(Exception e) {
		return;
	}
	discount.reduction(0.20);
	
	}

}