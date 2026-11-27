import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}
