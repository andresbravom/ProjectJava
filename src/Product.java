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
		
		System.out.println("test 1");
		Category aux = Category.general.search_category(category_name);
		System.out.println("test 2");
		//esto no funciona
		aux.products.insert_product(this);
		System.out.println("test 3");

		
		
		
		this.name = name;
		this.id_product = id_product;
		this.stock = stock;
		this.prize = prize;
	}
	
	public void buy_product(User name) {
		name.add_product(this);
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
	
