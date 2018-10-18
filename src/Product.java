import java.util.Scanner;

public class Product {
	static List_product general = new List_product();
	
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
		general.insert_product(this);
	
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
}
	
