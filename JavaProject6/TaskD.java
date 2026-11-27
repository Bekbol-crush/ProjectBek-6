import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine().trim();

        int count = 0;

        if (!text.isEmpty()) {

            String[] words = text.split("\\s+");

            count = words.length;
        }

        System.out.println("Words = " + count);
    }
}
