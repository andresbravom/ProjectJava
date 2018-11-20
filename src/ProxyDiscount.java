
public class ProxyDiscount implements Discount {

	DiscountCode code = new DiscountCode();
	
	@Override
	public void reduction(Double n) {
		System.out.println("Aplicando descuento");
		code.reduction(n);
		
	}
	

}
