import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Controller {
	


    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button buttonLogin;
    	

    @FXML
    private Button buttonExit;
    
    
    @FXML
    void exit(ActionEvent event) {
    	General.login.close();
    	
    }
    
    @FXML
    private Button buttonEnglish;
    
    
    @FXML
    private MenuButton mainMenu;

    @FXML
    private MenuItem option1;

    @FXML
    private MenuItem option2;

    @FXML
    private MenuItem option3;

    @FXML
    private MenuItem option4;

    @FXML
    private MenuItem option5;

    @FXML
    private MenuItem option6;

    @FXML
    private MenuItem option7;

    @FXML
    private MenuItem option8;

    @FXML
    private MenuItem option9;

    @FXML
    private MenuItem option10;
    
    @FXML
    private Button s;
    
    
    @FXML
  
    void login(ActionEvent event) {
   
		String textUserName = username.getText();
		String textPassword = password.getText();
		
		if (AuthentificationUser .authentification(textUserName, textPassword)) {
			
			General.login.close();
			General.languages.show();
    		
    	
    	}
    }
    
    @FXML
    void selectEnglish(ActionEvent event) {
    	General.languages.close();
    	General.menu.show();

    }
    @FXML
    private TextField textAreaProducts;

    @FXML
    void SeeAllProducts(ActionEvent event) {
    	
    	General.menu.close();
    	
    	
    
    	General.option1.show();
    	
    }	
    
    @FXML
    void seeAllCategories(ActionEvent event) {
    	General.menu.close();
    	General.option2.show();
    }
    
    
    @FXML
    void searchAProducts(ActionEvent event) {

    
    	General.menu.close();
    	General.option3.show();

    }
    
    @FXML
    void searchProductByCategory(ActionEvent event) {
    	General.menu.close();
    	General.option4.show();
    }
    
    @FXML
    void buy(ActionEvent event) {
    	General.menu.close();
    	General.option5.show();
    }
    
    @FXML
    void yourProducts(ActionEvent event) {
    	General.menu.close();
    	General.option6.show();

    }
    @FXML
    void ApplyDiscount(ActionEvent event) {
    	General.menu.close();
    	General.option7.show();
    }
    
    @FXML
    void contactWithUs(ActionEvent event) {
    	General.menu.close();
    	General.option8.show();
    }
    @FXML
    void leaveAComent(ActionEvent event) {
    	General.menu.close();
    	General.option9.show();
    }
    
    @FXML
    void currencyConverter(ActionEvent event) {
    	General.menu.close();
    	General.option10.show();

    }
    


    

    

    @FXML
    void displayMenu(ActionEvent event) {

    }

   

    
   
    

}




