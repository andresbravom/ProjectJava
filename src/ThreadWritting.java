public class ThreadWritting extends ReadingClass implements Runnable{
	private Product product;
	private ThreadReading thread;
	
	public ThreadWritting(Product product, ThreadReading thread) {
		this.product = product;
		this.thread = thread;
	}
	
	public void run() {
		System.out.println("Stopping any purchase of this product ");
		System.out.println("Waitting for show name product bought:");
		
		product.setName(this.readLine());
		thread.interrupt();
	}

}
