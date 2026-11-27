import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine().toLowerCase();

        String[] words = text.split("\\s+");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            String first = word.substring(0, 1).toUpperCase();

            String rest = word.substring(1);

            result += first + rest + " ";
        }

        System.out.println(result.trim());
    }
}
