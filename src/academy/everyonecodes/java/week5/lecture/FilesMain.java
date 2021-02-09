package academy.everyonecodes.java.week5.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesMain {
    public static void main(String[] args) {
//        String contentRootPath = "src/academy/everyonecodes/java/week5/lecture/files/document.txt";
//        Path filePath = Path.of(contentRootPath);
//        try {
//            List<String> lines = Files.readAllLines(filePath);
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        FileWriter writer = new FileWriter();
        String contentRootPathCopied = "src/academy/everyonecodes/java/week5/lecture/files/document-copied.txt";
        writer.write(contentRootPathCopied, List.of("First line in file", "Second line in file"));

        try {
            Files.delete(Path.of(contentRootPathCopied));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
