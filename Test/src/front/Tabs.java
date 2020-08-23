package front;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class Tabs {
    public TabPane gettabs() {
        TabPane tabpane =  new TabPane();
        Tab tab1 = new Tab();
        Front fr = new Front();
        tab1.setContent(fr.getFront());
        tabpane.getTabs().addAll(tab1);
        return tabpane;
    }
}