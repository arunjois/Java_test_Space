package front;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import front.Tabs;
public class Main extends Application {
    public static void main(String args[]) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        StackPane sp = new StackPane();
        Tabs t = new Tabs();
        sp.getChildren().add(t.tabs());
        Scene sc = new Scene(sp);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}