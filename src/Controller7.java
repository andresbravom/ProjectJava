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
    	double discount = 0.20;
    	String totalDiscount ="";
    	
    	for(int i=0; i<User.actualUser.buyList.size();i++) {
    	Double total = User.actualUser.buyList.get(i).getPrize();
    	
    	discount = total * discount;
    	total = total - discount;
    	
    	totalDiscount = String.valueOf(total);
    	
    	textArea.setText("\r\nTotal cost of your puchases: " + User.actualUser.buyList.get(i).getPrize() + "€" + "\r\n"
    			+"\r\nTotal with 20% of discount: " + totalDiscount + "€");
    	}

    }

    @FXML
    void backToMenu(ActionEvent event) {

    	General.option7.close();
    	General.menu.show();
    }

}
