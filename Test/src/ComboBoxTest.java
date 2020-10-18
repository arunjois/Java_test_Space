import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ComboBoxTest extends Application {

    ComboBox<String> b2;
    @Override
    public void start(Stage primaryStage) {
        Label label1;
        Label label2;
        ComboBox<String> b1;
        //ComboBox<String> b2;
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        label1 = new Label("List One");
        label2 = new Label("List Two");
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        //list2.add("One-One");
        //list2.add("Two-Two");
        //list2.add("Three-Three");
        ObservableList<String> options = FXCollections.observableArrayList(list1);
        ObservableList<String> result = FXCollections.observableArrayList(list2);
        b1 = new ComboBox<String>(options); 
        b2 = new ComboBox<String>(result);
        Button button = new Button("OK");
        BorderPane pane = new BorderPane();
        HBox one = new HBox(label1,b1);
        HBox two = new HBox(label2,b2);
        pane.setTop(one);
        pane.setCenter(two);
        pane.setBottom(button);
        //Logic for selection
        b1.setOnAction(e-> {
            //String selectedItem = b1.getSelectionModel().getSelectedItem();
            loadb2(b1.getSelectionModel().getSelectedItem());
        });
        Scene myScene = new Scene(pane);
        primaryStage.setScene(myScene);
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.show();
    }
    void loadb2(String text) {
        
    }

    public static void main(String args[]) {
        launch();
    }
}