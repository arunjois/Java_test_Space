import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
public class VBoxSet {
    public VBox vb;
    public VBoxSet() {
        this.vb = new VBox(3);
    }
    public VBox getVBox() {
        this.vb.getChildren().addAll(new Button("haha"));
        return this.vb;
    }
}