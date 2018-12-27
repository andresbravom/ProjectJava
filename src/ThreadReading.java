public class ThreadReading extends Thread{
	
	private Product product;
	
	public ThreadReading(Product product) {
		this.product = product;
	}
	
	public void run() {
		try {
			sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Product bought");
		}
		
		String p = product.getName();
		System.out.println(p);
	}

}
