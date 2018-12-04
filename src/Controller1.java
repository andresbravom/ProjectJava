import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller1 {

    @FXML
    private Button refreshProducts;

    @FXML
    private Button Back;

    @FXML
    private TextArea textAreaProducts;

    @FXML
    void BackToMenu(ActionEvent event) {

    	General.option1.close();
    	General.menu.show();
    }

    @FXML
    void SeeAllProducts(ActionEvent event) {

    	String x = "";
    	
    	for(int i=0; i < Product.general.list.size(); i++) {
    		x += Product.general.list.get(i).getName() + " " + Product.general.list.get(i).getPrize() + "€" + "\r\n";
    		
    	}
    	
    	textAreaProducts.setText("Products in stock: \r\n"+ "\r\n" + x);
    }

}