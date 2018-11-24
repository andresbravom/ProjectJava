import java.util.ArrayList;
import java.util.List;

public class ListProduct {
	
	List<Product> list = new ArrayList<Product>();
	
	public void insert_product(Product name) {
		list.add(name);
	}
	
	public Product search_product(String name_product) {
		int i = 0;
		boolean found = false;
		
		while(i < list.size()) {
			if (name_product.equals( list.get(i).getName())) {
				found = true;
				break;
			}
			i++;
		}
		if(found) {
			return list.get(i);
		}
		else 
			return null;
	}
}
