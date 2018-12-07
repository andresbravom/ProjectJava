import java.math.BigDecimal;
import java.math.RoundingMode;

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
    private TextField totalD;
    
    @FXML
    private TextField totalE;

    @FXML
    void BackToMenu(ActionEvent event) {
    	
    	moneyIn.clear();
    	totalD.clear();
    	totalE.clear();
    	General.option10.close();
    	General.menu.show();

    }

    @FXML
    void changeToDollar(ActionEvent event) {
    	
    	BigDecimal moneyDollar = new BigDecimal(moneyIn.getText());
    	BigDecimal currencyDollar = new BigDecimal(1.13);
    	currencyDollar = currencyDollar.setScale(2, RoundingMode.HALF_UP);
    	String totalDollar = "";
    	String totalEuro = "";
    	
    	currencyDollar = moneyDollar.multiply(currencyDollar);
    	totalDollar = String.valueOf(currencyDollar);
    	totalEuro = String.valueOf(moneyDollar);
    	
    	totalD.setText(totalDollar+ "$");
    	totalE.setText(totalEuro);

    }

    @FXML
    void changeToEuro(ActionEvent event) {

    	BigDecimal moneyEuro = new BigDecimal(moneyIn.getText());
    	BigDecimal currencyEuro = new BigDecimal(1.13);
    	currencyEuro = currencyEuro.setScale(2, RoundingMode.HALF_UP);
    	String totalEuro = "";
    	String totalDollar = "";
    
    	currencyEuro = moneyEuro.divide(currencyEuro);
    	totalEuro = String.valueOf(currencyEuro);
    	totalDollar = String.valueOf(moneyEuro);
    	
    	totalE.setText(totalEuro + "€");
    	totalD.setText(totalDollar);
    	
    }

}