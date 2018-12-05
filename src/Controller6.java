import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller6 {

    @FXML
    private TextArea textArea;

    @FXML
    private Button back;

    @FXML
    private Button buttonRefresh;

    @FXML
    void backToMenu(ActionEvent event) {
    	
    	General.option6.close();
    	General.menu.show();

    }

    @FXML
    void productsBought(ActionEvent event) {
    	 
    	for(int i=0; i<User.actualUser.buyList.size();i++) {
    		textArea.setText(User.actualUser.buyList.get(i).getName()+ " " + 
    		User.actualUser.buyList.get(i).getPrize() + "€");
    		
    	
    	
    		
    	}
    }

}