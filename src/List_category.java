import java.util.ArrayList;
import java.util.List;

public class List_category {
	
	List<Category> cList = new ArrayList<Category>();
	
	public void addCategory (Category name) {
		cList.add(name);
	}
	
	public Category search_category(String name_category) {
		
		int i = 0;
		boolean found = false;
		while(i < cList.size()) {
			
			if (name_category.equals( cList.get(i).getName()))  {
				found = true;
				break;
			}
			i++;	
		}
		if (found) {
			return cList.get(i);
		}else
			return null;
			
	}
	
}
