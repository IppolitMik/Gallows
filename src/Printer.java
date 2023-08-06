import java.util.Scanner;

public class Printer {
    public static void printGallows(int errorsCount, Scanner scanner, String[] word) {
        switch (errorsCount) {
            case 1 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 2 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "   O |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 3 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "   O |" + "\n" +
                    "   | |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 4 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "   O |" + "\n" +
                    "   |>|" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 5 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "   O |" + "\n" +
                    "  <|>|" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 6 -> System.out.println(
                "   ___" + "\n" +
                    "   | |" + "\n" +
                    "   O |" + "\n" +
                    "  <|>|" + "\n" +
                    "   | |" + "\n" +
                    "     |" + "\n" +
                    "     |" + "\n" +
                    "-------"
            );
            case 7 -> {
                System.out.println(
                    "   ___" + "\n" +
                        "   | |" + "\n" +
                        "   O |" + "\n" +
                        "  <|>|" + "\n" +
                        "   | |" + "\n" +
                        "  /  |" + "\n" +
                        "     |" + "\n" +
                        "-------"
                );
                System.out.println("ВНИМАНИЕ, у Вас осталась последняя попытка!");
            }
            case 8 -> {
                System.out.println(
                    "   ___" + "\n" +
                        "   | |" + "\n" +
                        "   O |" + "\n" +
                        "  <|>|" + "\n" +
                        "   | |" + "\n" +
                        "  / ||" + "\n" +
                        "     |" + "\n" +
                        "-------"
                );
                Utils.loserMessage(scanner, word);
            }
        }
    }
}