import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            result += text.charAt(i);
        }

        System.out.println(result);
    }
}
