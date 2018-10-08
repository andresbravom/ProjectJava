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
		Category producto_categoria = new Category(category_name);
		this.name = name;
		this.id_product = id_product;
		this.stock = stock;
		this.prize = prize;
	}
	
	Product(String name, int id_product){
		this.name = name;
		this.id_product = id_product;
		
	}
	
}