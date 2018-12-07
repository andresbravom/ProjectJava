import java.math.BigDecimal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller10 {

    @FXML
    private Button Back;

    @FXML
    private TextField moneyIn;

    @FXML
    private Button dollar;

    @FXML
    private Button euro;

    @FXML
    private TextField total;

    @FXML
    void BackToMenu(ActionEvent event) {
    	
    	General.option10.close();
    	General.menu.show();

    }

    @FXML
    void changeToDollar(ActionEvent event) {
    	
    	BigDecimal money = new BigDecimal(moneyIn.getText());
    	BigDecimal currency = new BigDecimal(1.3);
    	String total1 = "";
    
    	
    	currency = money.multiply(currency);
    	
    	total1 = String.valueOf(currency);
    	
    	total.setText(total1);
	

    }

    @FXML
    void changeToEuro(ActionEvent event) {

    }

}