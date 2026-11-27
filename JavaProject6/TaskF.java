import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (!Character.isDigit(ch)) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
