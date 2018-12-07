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
    	String totalDollar = "";
    
    	
    	currency = money.multiply(currency);
    	
    	totalDollar = String.valueOf(currency);
    	
    	total.setText(totalDollar+ "$");
	

    }

    @FXML
    void changeToEuro(ActionEvent event) {

    	BigDecimal money = new BigDecimal(moneyIn.getText());
    	BigDecimal currency = new BigDecimal(1.3);
    	String totalEuro = "";
    
    	
    	currency = money.divide(currency);
    	
    	totalEuro = String.valueOf(currency);
    	
    	total.setText(totalEuro + "€");
    	
    }

}