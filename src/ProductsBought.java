import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class ProductsBought extends User{

	ProductsBought(String username, String password) {
		super(username, password);
		
	}
	static void printProductsBuy(User n) {
		
		for(int i=0; i<n.buyList.size();i++) {
			System.out.print("\n" + n.buyList.get(i).getName()+" "+n.buyList.get(i).getPrize()+"€");
		}
	}
	static double printTotalProductsBuy(User n) {
		
		double total = 0;
		for(int i=0; i<n.buyList.size(); i++) {
			
			total = total+ n.buyList.get(i).getPrize();
			
		}
		
		System.out.println("Total of your purchase: " + total+"€");
		return total;
	}
	


}
