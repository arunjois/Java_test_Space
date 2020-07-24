import java.nio.file.Files;
import java.nio.file.Path;;
import java.nio.file.Paths;
import java.io.IOException;
public class CreateFile {
    public static void main(String args[]) throws IOException {
        Path p = Paths.get("~/.Shankari/config.txt");
        Files.createFile(p);
    }
    
}