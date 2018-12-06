import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller4 {

    @FXML
    private Label searchCategory;

    @FXML
    private TextField searchProductByCategory;

    @FXML
    private TextArea textArea;

    @FXML
    private Button buttonSearch;

    @FXML
    private Button back;

    @FXML
    void backToMenu(ActionEvent event) {

    	searchProductByCategory.clear();
    	textArea.clear();
    	General.option4.close();
    	General.menu.show();
    }

    @FXML
    void searchCategory(ActionEvent event) {

    	String nameCategory = searchProductByCategory.getText();
    	
    	if(Category.general.searchCategory(nameCategory) !=null) {
    		textArea.setText("Categories in stock:\r\n" +
    		Category.general.searchCategory(nameCategory).getName()+"\r\n" +
    		"ID Catgory: " + Category.general.searchCategory(nameCategory).getId_category());
     	
    	}else {
    		textArea.setText("Category not found");
    	}

    }
    

}

