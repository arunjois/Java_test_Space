package front;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
    public static void main(String args[]) {
        launch(args);
    }
    @Override 
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        VBoxSet vbset = new VBoxSet();
        //root.setCenter(vbset.getVBox());
        root.setTop(vbset.getVBox());




        Scene myscene = new  Scene(root);
        primaryStage.setScene(myscene);
        primaryStage.setMaximized(true);;
        primaryStage.show();
    }
}