import java.util.Scanner;

	class Product {
	static ListProduct general = new ListProduct();
	
	private String name;
	private int idProduct;
	private int stock;
	private double prize;
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected int getId() {
		return idProduct;
	}
	
	protected void setId(int id) {
		this.idProduct = id;
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
		this.idProduct = id_product;
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
	static void printProducts(Category n) {
		
		System.out.println("\nProducts in stock:");
		
		for(int i=0; i < n.products.list.size(); i++){
			
			System.out.println("\n" + n.products.list.get(i).getName() + " " + n.products.list.get(i).getPrize() + "€");
				
		}			
	}
	
	
}
	
