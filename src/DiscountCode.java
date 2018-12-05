import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DiscountCode implements Discount{

	@Override
	public void reduction(Double n) {
		
		System.out.println("\n------------------------------------");
		double total = ProductsBought.printTotalProductsBuy(User.actualUser);
	
		System.out.println("\nApplying the discount of: " + n + "%");
		
		n = total * n;
		total = total - n;
	
		System.out.println("\nTotal of your purchase: "+ total);	
		System.out.println("\n¡Your gift will be wrapped for free!");
		
	}	
	
}


