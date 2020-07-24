import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class DirectoryWalk {
    public static void main(String args[]) throws IOException{
        try (Stream<Path> walk = Files.walk(Paths.get(System.getProperty("user.dir")))) {

            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());
        
            result.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}