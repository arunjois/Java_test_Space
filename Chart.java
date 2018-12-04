import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.control.*;
public class Chart extends Application {
	public static void main(String args[]) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {

		Canvas canvas = new Canvas();
		canvas.setWidth(800);
		canvas.setHeight(500);

		// Get the graphics context of the canvas
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// Draw a Text
		//gc.strokeText("Hello Canvas", 150, 100);

		// Create the Pane
		Pane root = new Pane();
		// Set the Style-properties of the Pane
		/*root.setStyle("-fx-padding: 10;" +
		  "-fx-border-style: solid inside;" +
		  "-fx-border-width: 2;" +
		  "-fx-border-insets: 5;" +
		  "-fx-border-radius: 5;" +
		  "-fx-border-color: blue;");
		  */	
		// Add the Canvas to the Pane

		gc.strokeRect(10,10,780,470);     //Rectangle Box
		gc.strokeLine(10,115,790,115);    //Line Stroke
		gc.strokeLine(10,370,790,370);
		gc.strokeLine(10,235,150,235);    //Horizontal Left lines
		gc.strokeLine(650,235,790,235);   //Horizontal Right lines
		gc.strokeLine(385,10,385,115);    //Vertical Top Line
		gc.strokeLine(385,370,385,480);   //Vertical Bottom Line
		gc.strokeLine(150,10,150,480);
		gc.strokeLine(650,10,650,480);     //Vertical Line Long
		final Label title = new Label("Some text");
		//title.setMaxWidth(Double.MAX_VALUE);
		title.setAlignment(Pos.CENTER);





		root.getChildren().add(canvas);
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the Scene to the Stage
		stage.setScene(scene);
		// Set the Title of the Stage
		stage.setTitle("Creation of a Canvas");
		// Display the Stage
		stage.show();
	}

}
