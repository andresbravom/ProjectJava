import java.util.ArrayList;
import java.util.List;

public class ListCategory {
	
	List<Category> list = new ArrayList<Category>();
	
	public void addCategory (Category name) {
		list.add(name);
	}
	
	public Category search_category(String name_category) {
		
		int i = 0;
		boolean found = false;
		while(i < list.size()) {
			
			if (name_category.equals( list.get(i).getName()))  {
				found = true;
				break;
			}
			i++;	
		}
		if (found) {
			return list.get(i);
		}else
			return null;
			
	}
}
