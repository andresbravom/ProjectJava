import java.util.Locale;

public class Category {
	
	private String name;
	private int id_category;
	static ListCategory general = new ListCategory();
	ListProduct products = new ListProduct(); 
	
	static Messages messages = null;
	static Locale locale = null;

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
		general.addCategory(this);
		
	}
}