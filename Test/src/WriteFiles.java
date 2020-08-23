//package test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Paths;
public class WriteFiles {
	public void write() {
		try {
			Files.copy(Paths.get("//Users//arun.jo//Documents//Arun//Java_test_space//Hello.java"),
                    Paths.get(System.getProperty("user.dir")+"//Hello.java"), StandardCopyOption.REPLACE_EXISTING);
		}
		catch(IOException e) {
			System.out.println("Entering Catch");
			System.out.println(e.getMessage());
		}
	}
}