import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
  
    void login(ActionEvent event) {
    
   
    		String textUserName = username.getText();
    		String textPassword = password.getText();
    		
    		if (AuthentificationUser .authentification(textUserName, textPassword)) {
    			
    			General.login.close();
    			General.languages.show();
    		
    		}
    		
    	
    }
}
