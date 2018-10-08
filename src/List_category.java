import java.util.ArrayList;
import java.util.List;

public class List_category {
	
	List<Category> list = new ArrayList();
	
	public void addCategory (Category name) {
		list.add(name);
	}
	
	public Category search_category(String name_category) {
		int i = 0;
		boolean found = false;
		
		while(i <= list.size()) {
			if (name_category == list.get(i).getName()) {
				found = true;
				i++;
			}
				
		}
		if (found) {
			return list.get(i);
		}else
			return null;
			
	}
	
}
