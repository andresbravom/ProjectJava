import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class General extends Application {
	
	static Stage login;
	static Stage languages;
	static Stage menu;
	static Stage mainMenu1;
	static Stage option1;
	static Stage option2;
	static Stage option3;
	static Stage option4;
	static Stage option5;
	static Stage option6;
	static Stage option7;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			login = new Stage();
			URL authentication  = getClass().getClassLoader().getResource("Authentication.fxml");
			Parent rootAuthentication = FXMLLoader.load(authentication);
			Scene sceneLogin = new Scene (rootAuthentication);
			login.setTitle("Login");
			login.setScene(sceneLogin);
			login.show();
			
			languages = new Stage();
			URL language = getClass().getClassLoader().getResource("Language.fxml");
			Parent rootLanguage = FXMLLoader.load(language);
			Scene sceneLanguage = new Scene(rootLanguage);
			languages.setTitle("Language");
			languages.setScene(sceneLanguage);
			
			
			menu = new Stage();
			URL menu1 = getClass().getClassLoader().getResource("Menu.fxml");
			Parent rootMenu = FXMLLoader.load(menu1);
			Scene sceneMenu = new Scene (rootMenu);
			menu.setTitle("Menu");
			menu.setScene(sceneMenu);
			
			option1 = new Stage();
			URL op1 = getClass().getClassLoader().getResource("Option1.fxml");
			Parent rootOption1 = FXMLLoader.load(op1);
			Scene sceneOption1 = new Scene (rootOption1);
			option1.setTitle("Option1");
			option1.setScene(sceneOption1);
			
			option2 = new Stage();
			URL op2 = getClass().getClassLoader().getResource("Option2.fxml");
			Parent rootOption2 = FXMLLoader.load(op2);
			Scene sceneOption2 = new Scene(rootOption2);
			option2.setTitle("Option2");
			option2.setScene(sceneOption2);
			
			option3 = new Stage();
			URL op3 = getClass().getClassLoader().getResource("Option3.fxml");
			Parent rootOption3 = FXMLLoader.load(op3);
			Scene sceneOption3 = new Scene(rootOption3);
			option3.setTitle("Option3");
			option3.setScene(sceneOption3);
			
			option4 = new Stage();
			URL op4 = getClass().getClassLoader().getResource("Option4.fxml");
			Parent rootOption4 = FXMLLoader.load(op4);
			Scene sceneOption4 = new Scene(rootOption4);
			option4.setTitle("Option4");
			option4.setScene(sceneOption4);
			
			option5 = new Stage();
			URL op5 = getClass().getClassLoader().getResource("Option5.fxml");
			Parent rootOption5 = FXMLLoader.load(op5);
			Scene sceneOption5 = new Scene(rootOption5);
			option5.setTitle("Option5");
			option5.setScene(sceneOption5);
			
			option6 = new Stage();
			URL op6 = getClass().getClassLoader().getResource("Option6.fxml");
			Parent rootOption6 = FXMLLoader.load(op6);
			Scene sceneOption6 = new Scene(rootOption6);
			option6.setTitle("Option6");
			option6.setScene(sceneOption6);
			
			option7 = new Stage();
			URL op7 = getClass().getClassLoader().getResource("Option7.fxml");
			Parent rootOption7 = FXMLLoader.load(op7);
			Scene sceneOption7 = new Scene(rootOption7);
			option7.setTitle("Option7");
			option7.setScene(sceneOption7);
			
					
			
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	public static void Inicio() {
			launch(null);
	}
	
}


