import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import java.io.*;
import javafx.stage.FileChooser;

public class FileChooser_1 extends Application {
    public void start(Stage stage) {
        try {
            stage.setTitle("FileChooser");
            FileChooser fil_chooser = new FileChooser();
            Label label = new Label("no files selected");
            Button button = new Button("Show open dialog");
            EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e) {
                    File file = fil_chooser.showOpenDialog(stage);
                    if (file != null) {
                        label.setText(file.getAbsolutePath() + "  selected");
                    }
                }
            };
            button.setOnAction(event);
            Button button1 = new Button("Show save dialog");
            EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e) {
                    File file = fil_chooser.showSaveDialog(stage);
                    if (file != null) {
                        label.setText(file.getAbsolutePath() + "  selected");
                    }
                }
            };
            button1.setOnAction(event1);
            VBox vbox = new VBox(30, label, button, button1);
            vbox.setAlignment(Pos.CENTER);
            Scene scene = new Scene(vbox, 800, 500);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        launch(args);
    }
}