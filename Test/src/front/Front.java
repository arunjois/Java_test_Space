package front;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
public class Front {
    public BorderPane getFront() {
        BorderPane sp = new BorderPane();
        StackPane stp = new StackPane(new Button("HAHA Stackpane"));
        sp.setCenter(stp);
        return sp;
    }
}