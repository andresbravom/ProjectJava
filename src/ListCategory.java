import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListCategory {
	
	static Messages messages = null;
	static Locale locale = null;
	
	List<Category> list = new ArrayList<Category>();
	
	public void addCategory (Category name) {
		list.add(name);
	}
	
	public Category searchCategory(String nameCategory) {
		
		int i = 0;
		boolean found = false;
		while(i < list.size()) {
			
			if (nameCategory.equals( list.get(i).getName()))  {
				found = true;
				break;
			}
			i++;	
		}
		if (found) {
			return list.get(i);
		}else {
			return null;
		}
	}
}
