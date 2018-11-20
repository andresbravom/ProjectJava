
public class DiscountCode implements Discount{

	@Override
	public void reduction(Double n) {
		double total = Menu.printTotalProductsBuy(Menu.actualUser);
		System.out.println("Comprobando descuento" + n);
		n = total*n;
		total = total-n;
	
		System.out.println("El nuevo total es:"+ total);
	}
	
	
}
