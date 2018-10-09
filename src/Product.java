import java.util.Scanner;

public class Product {
	
	private String name;
	private int id_product;
	private int stock;
	private double prize;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	protected int getId() {
		return id_product;
	}
	protected void setId(int id) {
		this.id_product = id;
	}
	
	protected int getStock() {
		return stock;
	}
	protected void setStock(int stock) {
		this.stock = stock;
	}
	
	protected double getPrize() {
		return prize;
	}
	protected void setPrize(double prize) {
		this.prize = prize;
	}
	
	Product(String name, int id_product, String category_name, int stock, double prize){
		this.name = name;
		this.id_product = id_product;
		this.stock = stock;
		this.prize = prize;

		
		Category.general.search_category(category_name).products.insert_product(this);
	

	}
	
	public boolean buy_product(User name) {
		boolean error = true;
		
		if(stock > 0) {
			stock--;
			name.add_product(this);
			error = false;
		}
			
		return error;
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		int opcion;
		
		while(!exit) {
			System.out.println("1. Search Product");
			System.out.println("2. Search Categories");
			System.out.println("3. Buy Product");
			
			System.out.println("1. Exit");
		}
		
		
		
		Product a = new Product("S", 4, "W", 6, 1);
		
		System.out.println(a.id_product);
		*/
	}
	
