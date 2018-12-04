import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller3 {

    @FXML
    private TextField searchProduct;

    @FXML
    private TextArea textArea;

    @FXML
    private Button searchButton;

    @FXML
    private Button back;

    @FXML
    void backToMenu(ActionEvent event) {
    	General.option3.close();
    	General.menu.show();

    }

    @FXML
    void enterAProducts(ActionEvent event) {

    }

    @FXML
    void searchAProducts(ActionEvent event) {

    }

}
