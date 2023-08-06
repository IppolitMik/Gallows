import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = Reader.getWord();
        Utils.startProgram(scanner, word);
        Game.startGame(scanner, word);
    }
}