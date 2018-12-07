import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller9 {

    @FXML
    private Button back;

    @FXML
    private Button contactButton;

    @FXML
    private TextArea textAreaF;

    @FXML
    private TextArea textAreaT;

    @FXML
    private TextArea textAreaL;

    @FXML
    void backToMenu(ActionEvent event) {
    	
    	textAreaF.clear();
    	textAreaT.clear();
    	textAreaL.clear();
    	General.option9.close();
    	General.menu.show();

    }

    @FXML
    void showContact(ActionEvent event) {
    	
    	textAreaF.setText("facebook.com/AndrewShop");
    	textAreaT.setText("twitter.com/AndrewShop");
    	textAreaL.setText("linkedin.com/AndrewShop");
    	
    }

}
