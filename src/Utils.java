import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    protected static void startProgram(Scanner scanner, String[] word) {
        System.out.println("Начать новую игру(+) или выйти из приложения(-)");
        switch (scanner.next()) {
            case "+" -> Game.startGame(scanner, word);
            case "-" -> {
                System.out.println("Приложение закончило свою работу");
                System.exit(0);
            }
            default -> {
                System.out.println("Введите + или - ");
                Utils.startProgram(scanner, word);
            }
        }
    }

    protected static void winnerMessage(Scanner scanner, String[] word) {
        String[] newWord = Reader.getWord();
        System.out.println("Вы угадали слово: " + Arrays.toString(word) + ". Поздравляем!");
        Utils.startProgram(scanner, newWord);
    }

    protected static void loserMessage(Scanner scanner, String[] word) {
        String[] newWord = Reader.getWord();
        System.out.println("Вы не смогли угадать слово: " + Arrays.toString(word));
        Utils.startProgram(scanner, newWord);
    }

    protected static String[] hideWord(String[] word) {
        String[] hiddenWord = new String[word.length];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = "_";
        }
        return hiddenWord;
    }

    protected static boolean checkLetter(String letter) {
        return letter.matches("[а-яА-ЯёЁ]");
    }
}