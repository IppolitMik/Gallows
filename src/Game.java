import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void startGame(Scanner scanner, String[] word) {
        List<String> usedLetters = new LinkedList<>();
        int errorCount = 0;
        String[] hiddenWord = Utils.hideWord(word);
        System.out.println("Загаданное слово: " + Arrays.toString(hiddenWord));
        while (!Arrays.equals(word, hiddenWord) || errorCount < 9) {
            String letter = scanner.next().toLowerCase();
            if (!Utils.checkLetter(letter)) {
                System.out.println("Введите одну букву на кириллице");
            } else if (!usedLetters.contains(letter)) {
                boolean incorrectGuess = true;
                usedLetters.add(letter);
                for (int i = 0; i < word.length; i++) {
                    if (letter.equals(word[i])) {
                        hiddenWord[i] = letter;
                        incorrectGuess = false;
                    }
                }
                if (incorrectGuess) {
                    errorCount++;
                }
                if (Arrays.equals(word, hiddenWord)) {
                    Utils.winnerMessage(scanner, word);
                }
            }
            Printer.printGallows(errorCount, scanner, word);
            System.out.println("Неудачных попыток: " + errorCount);
            System.out.println("Использованные буквы: " + usedLetters);
            System.out.println("Загаданное слово: " + Arrays.toString(hiddenWord));
        }
    }
}