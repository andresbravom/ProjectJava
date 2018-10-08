public class Category {
	
	private String name;
	private int id_category;

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Category(String name, int id_category){
		this.name = name;
		this.id_category = id_category;
	}
	
	Category(String name){
	this.name = name;
	
	}

}