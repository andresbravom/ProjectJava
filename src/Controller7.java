import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller7 {

    @FXML
    private TextArea textArea;

    @FXML
    private Button back;

    @FXML
    private Button buttonDiscount;

    @FXML
    void applyDiscount(ActionEvent event) {
    	double n = 0.20;
    	String a ="";
    	
    	for(int i=0; i<User.actualUser.buyList.size();i++) {
    	Double total = User.actualUser.buyList.get(i).getPrize();
    	
    	n = total * n;
    	total = total - n;
    	
    	a = String.valueOf(total);
    	
    	textArea.setText(a);
    	}

    }

    @FXML
    void backToMenu(ActionEvent event) {

    	General.option7.close();
    	General.menu.show();
    }

}
