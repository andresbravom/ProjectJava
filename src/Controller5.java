import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller5 {

    @FXML
    private TextField buyProduct;

    @FXML
    private TextArea textArea;

    @FXML
    private Button buttonBuy;

    @FXML
    private Button back;

    @FXML
    void backToMenu(ActionEvent event) {
    	
    	General.option5.close();
    	General.menu.show();

    }

    @FXML
    void buyProduct(ActionEvent event) {
    	String productBuy = buyProduct.getText();
    	
    	if (Product.general.search_product(productBuy) != null) {
    		Product.general.search_product(productBuy).buy_product(User.actualUser);
    		
    		textArea.setText("!Thanks for your purchase!");
    	}else {
    		textArea.setText("Product not found");
    	}

    }

}
