import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class DirectoryWalk {
    public static void main(String args[]) throws IOException {

        File folder = new File("/home/arun/ephe/");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                Files.copy(Paths.get("/home/arun/ephe/" + file.getName()), Paths.get("/home/arun/ephe1/" + file.getName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }

    }
}