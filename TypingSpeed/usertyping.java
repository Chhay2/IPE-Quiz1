package s2java;
import java.util.Scanner;
public class usertyping {
    public static void main(String[] args) {
        String[] texts = {
            "The quick brown fox jumps over the lazy dog.",
            "Do not study OOP and IPE",
        };
        int numTexts = texts.length;

        Scanner Input = new Scanner(System.in);
       

        System.out.println("Welcome to the typing test !");
        System.out.println("You will be given " + numTexts + " texts to type.");

        int totalChars = 0;
        int totalMistakes = 0;
        int totalTime = 0;

        for (int i = 0; i < numTexts; i++) {
            System.out.print("Press ENTER to start text " + (i+1) + "...");
            Input.nextLine();

            String text = texts[i];
            int numChars = text.length();
            totalChars += numChars;

            long startTime = System.currentTimeMillis();
            System.out.println(text);
            String input = Input.nextLine();
            long endTime = System.currentTimeMillis();

            int timeTaken = (int) ((endTime - startTime) / 1000.0);
            totalTime += timeTaken;

            int mistakes = countMistakes(text, input);
            totalMistakes += mistakes;

            System.out.println("Time taken: " + timeTaken + " seconds");
            System.out.println("Number of characters: " + numChars);
            System.out.println("Number of mistakes: " + mistakes);
            System.out.println();
        }

        double accuracy = 100.0 * (totalChars - totalMistakes) / totalChars;
        double wpm = 60.0 * totalChars / (5.0 * totalTime);

        System.out.println("Congratulations !");
        System.out.printf("Your typing speed is: %.2f", wpm+" words per minute"+"\n");
        System.out.printf("\nYour accuracy is: %.2f" ,accuracy , "%");
    }

    private static int countMistakes(String text, String input) {
        int mistakes = 0;
        int length = Math.min(text.length(), input.length());
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != input.charAt(i)) {
                mistakes++;
            }
        }
        mistakes += Math.abs(text.length() - input.length());
        return mistakes;
    }
}

