import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        text = text.replace(' ', '_');

        System.out.println(text);
    }
}