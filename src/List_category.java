import java.util.ArrayList;
import java.util.List;

public class List_category {
	
	List<Category> List = new ArrayList<Category>();
	
	public void addCategory (Category name) {
		List.add(name);
	}
	
	public Category search_category(String name_category) {
		
		int i = 0;
		boolean found = false;
		while(i < List.size()) {
			
			if (name_category.equals( List.get(i).getName()))  {
				found = true;
				break;
			}
			i++;	
		}
		if (found) {
			return List.get(i);
		}else
			return null;
			
	}
}
