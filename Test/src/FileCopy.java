import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy
{
    public static void main(final String[] args)
        throws IOException
    {
        Files.copy(Paths.get("E:\\Arun\\geonames1000.sql"),
            Paths.get("E:\\Arun\\output.sql"), StandardCopyOption.REPLACE_EXISTING);
    }
}
