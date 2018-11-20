import java.util.Scanner;

public class DiscountCode implements Discount{

	@Override
	public void reduction(Double n) {
		double total = Menu.printTotalProductsBuy(Menu.actualUser);
		
		String code;
		
		System.out.println("IEl código de dto es BlackFriday ");
		Scanner cod = new Scanner (System.in);
		code = cod.nextLine();
		
		if(code.equals("BlackFriday")) {
		
		System.out.println("Comprobando código de descuento" + n);
		n = total*n;
		total = total-n;
	
		System.out.println("El nuevo total es:"+ total);
		
		}else{
			System.out.println("El código introducido no es correcto");
			
		}
	}
	
	
}
