import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResponsiveLayoutDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label textLabel = new Label("Lorem ipsum dolor sit amet, "
                + "consectetur adipiscing elit, sed do eiusmod "
                + "tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation "
                + "ullamco laboris nisi ut aliquip ex ea commodo consequat. "
                + "Duis aute irure dolor in reprehenderit in voluptate velit "
                + "esse cillum dolore eu fugiat nulla pariatur. "
                + "Excepteur sint occaecat cupidatat non proident, "
                + "sunt in culpa qui officia deserunt mollit anim id est laborum. "
                + "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                + "sed do eiusmod tempor incididunt ut labore et dolore "
                + "magna aliqua. Ut enim ad minim veniam, quis nostrud "
                + "exercitation ullamco laboris nisi ut aliquip ex ea "
                + "commodo consequat. Duis aute irure dolor in "
                + "reprehenderit in voluptate velit esse cillum dolore eu "
                + "fugiat nulla pariatur. Excepteur sint occaecat cupidatat "
                + "non proident, sunt in culpa qui officia deserunt mollit "
                + "anim id est laborum.");

        textLabel.setWrapText(true);
        textLabel.setPrefWidth(360);

        ImageView imageView = new ImageView(new Image("http://goo.gl/1tEZxQ", 240, Double.MAX_VALUE, true, true));

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 8, 8, imageView, textLabel);
        flowPane.setRowValignment(VPos.TOP);
        primaryStage.setScene(new Scene(flowPane));
        primaryStage.show();
    }


    public static void main(String... args) {
        launch(args);
    }
}
