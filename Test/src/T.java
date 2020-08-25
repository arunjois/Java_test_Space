import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
public class T extends Application { 
	public void start(Stage stage) 
	{ 
		stage.setTitle("Creating Tab"); 
		TabPane tabpane = new TabPane(); 
		for (int i = 0; i < 10; i++) { 
			Tab tab = new Tab("Tab_" + (int)(i + 1)); 
			Label label = new Label("This is Tab: " + (int)(i + 1)); 
			tab.setContent(label); 
			tabpane.getTabs().add(tab); 
		} 
		Scene scene = new Scene(tabpane, 600, 500); 
		stage.setScene(scene); 
		stage.show(); 
	} 
	public static void main(String args[]) 
	{ 
		launch(args); 
	} 
} 
