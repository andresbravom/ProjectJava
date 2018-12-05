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
    	
    	General.option4.close();
    	General.menu.show();

    }

    @FXML
    void searchProduct(ActionEvent event) {
    	
    	String nameCategory = searchCategory.getText();
    	
    	if(Category.general.searchCategory(nameCategory) !=null) {
        		
        	
        	
        	
    		
    	}else {
    		textArea.setText("NO");
    	}

    }

}


/*
 *   @FXML
    void BackToMenu(ActionEvent event) {
    	General.option2.close();
    	General.menu.show();
    }

    @FXML
    void seeAllCategories(ActionEvent event) {
    		
    	String x = "";
    	for(int i=0; i< Category.general.list.size(); i++ ) {
    		x =  x + Category.general.list.get(i).getName()+ "\r\n";
    		textAreaCategories.setText("\n" + x);
    	}
    	
    }

}
 */

