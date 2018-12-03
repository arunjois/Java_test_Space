
// Java program to create multiple tabs  
// and add it to the TabPane 
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
  
public class TabPane_1 extends Application { 
  
    // launch the application 
    public void start(Stage stage) 
    { 
  
        // set title for the stage 
        stage.setTitle("Creating Tab"); 
  
        // create a tabpane 
        TabPane tabpane = new TabPane(); 
  
        // create multiple tabs 
        for (int i = 0; i < 10; i++) { 
  
            // create Tab 
            Tab tab = new Tab("Tab_" + (int)(i + 1)); 
  
            // create a label 
            Label label = new Label("This is Tab: " + (int)(i + 1)); 
  
            // add label to the tab 
            tab.setContent(label); 
  
            // add tab 
            tabpane.getTabs().add(tab); 
        } 
  
        // create a scene 
        Scene scene = new Scene(tabpane, 600, 500); 
  
        // set the scene 
        stage.setScene(scene); 
  
        stage.show(); 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
} 

