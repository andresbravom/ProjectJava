import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller2 {

    @FXML
    private Button refreshCategory;

    @FXML
    private TextField textAreaCategories;
    
    @FXML
    private Button Back;

    @FXML
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