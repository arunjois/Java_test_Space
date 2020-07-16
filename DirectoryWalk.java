import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalk {
    public static void main(String args[]) throws IOException{
        Files.walk(Paths.get(System.getProperty("user.dir")))
        .filter(Files::isRegularFile)
        .forEach(System.out::println);
    }
    
}