import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Reader {
    public static String[] getWord() {
        List<String> wordList;
        try {
            wordList = Files.readAllLines(Paths.get("src/russian_nouns.txt"));
        } catch (IOException e) {
            throw new RuntimeException("Проверьте путь к файлу");
        }
        return wordList.get(new Random().nextInt(wordList.size())).split("");
    }
}