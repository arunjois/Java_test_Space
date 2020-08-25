import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.event.Event;
import javafx.event.EventHandler;
public class TabPane_2 extends Application {
	int counter = 0;
	public void start(Stage stage)
	{
		stage.setTitle("Creating Tab");
		TabPane tabpane = new TabPane();
		for (int i = 0; i < 5; i++) {
			Tab tab = new Tab("Tab_" + (int)(counter + 1));
			Label label = new Label("This is Tab: "
			+ (int)(counter + 1));
			counter++;
			tab.setContent(label);
			tabpane.getTabs().add(tab);
		}
		Tab newtab = new Tab();
		EventHandler<Event> event =
		new EventHandler<Event>() {
			public void handle(Event e)
			{
				if (newtab.isSelected())
				{
					Tab tab = new Tab("Tab_" + (int)(counter + 1));
					Label label = new Label("This is Tab: "
					+ (int)(counter + 1));
					counter++;
					tab.setContent(label);
					tabpane.getTabs().add(
					tabpane.getTabs().size() - 1, tab);
					tabpane.getSelectionModel().select(
					tabpane.getTabs().size() - 2);
				}
			}
		};
		newtab.setOnSelectionChanged(event);
		tabpane.getTabs().add(newtab);
		Scene scene = new Scene(tabpane, 600, 500);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
}
