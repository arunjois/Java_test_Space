import javafx.concurrent.Task;
import javafx.application.Application;
import javafx.stage.Stage;
public class TaskTest extends Application{
	@Override
	public void start(Stage stage) {
		Task<Integer> task = new Task<Integer>() {
			@Override protected Integer call() throws Exception {
				int iterations;
				for (iterations = 0; iterations < 10000000; iterations++) {
					if (isCancelled()) {
						System.out.println("Cancelled");
						break;
					}
					System.out.println("Iteration " + iterations);
					System.out.println(iterations+ "10000000");
				}
				return iterations;
			}
		};
	}
	public static void main(String args[]) {
		launch(args);

	}

}
