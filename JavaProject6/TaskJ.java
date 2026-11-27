import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] words = text.trim().split("\\s+");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {

                longest = words[i];
            }
        }

        System.out.println(longest);
    }
}
