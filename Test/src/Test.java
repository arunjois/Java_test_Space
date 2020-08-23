import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuBar menuBar = new MenuBar();
		menuBar.useSystemMenuBarProperty().set(true);

		Menu menu = new Menu("java");
		MenuItem item = new MenuItem("Test");

		menu.getItems().add(item);
		menuBar.getMenus().add(menu);

		primaryStage.setScene(new Scene(new Pane(menuBar)));
		primaryStage.show();
	        primaryStage.setMaximized(true);

	}


	public static void main(String[] args) {
		Application.launch(args);
	}

}
