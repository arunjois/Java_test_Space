import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HTMLEditor htmlEditor = new HTMLEditor();

        StackPane myPane = new StackPane();
        myPane.getChildren().add(htmlEditor);
        Scene myScene = new Scene(myPane);

        primaryStage.setScene(myScene);
        primaryStage.setTitle("App");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
