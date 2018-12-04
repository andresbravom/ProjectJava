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
    	
    	textAreaProducts.setText("Hola");
    	
    }
}