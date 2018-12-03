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
			
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	public static void Inicio() {
			launch(null);
	}
	
}


