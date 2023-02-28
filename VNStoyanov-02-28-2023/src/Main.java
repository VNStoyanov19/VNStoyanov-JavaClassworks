import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\VNStoyanov19\\IdeaProjects\\untitled\\src");
        List<String> lines = Files.readAllLines(path);
        for(int i = 0; i < lines.size(); i++) {
            System.out.println();
        }
        Path outPath = Paths.get("");

        Files.write(path, lines);
    }
}