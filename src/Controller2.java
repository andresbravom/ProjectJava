import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller2 {

    @FXML
    private Button refreshCategory;

    @FXML
    private Button Back;

    @FXML
    private TextArea textAreaCategories;

    @FXML
    void BackToMenu(ActionEvent event) {

    	textAreaCategories.clear();
    	General.option2.close();
    	General.menu.show();
    }

    @FXML
    void seeAllCategories(ActionEvent event) {

    	String x = "";
    	for(int i=0; i< Category.general.list.size(); i++ ) {
    		x =  x + Category.general.list.get(i).getName() + "\r\n";
    		textAreaCategories.setText("Categories in stock: \r\n" + "\r\n" + x);
    	}
    }

}