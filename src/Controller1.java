import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller1 {

    @FXML
    private TextField textAreaProducts;

    @FXML
    private Button refreshProducts;
    
    @FXML
    private Button Back;

    @FXML
    void BackToMenu(ActionEvent event) {
    	
    	General.option1.close();
    	General.menu.show();
    }

    @FXML
    void SeeAllProducts(ActionEvent event) {
    	
    	String x = "";
    	for(int i=0; i < Product.general.list.size(); i++) {
    		x += Product.general.list.get(i).getName() + "\r\n";
    		
    	}
    	textAreaProducts.setText("\r\n" + x);
    }
}