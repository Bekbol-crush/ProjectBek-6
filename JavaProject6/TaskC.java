import java.util.Scanner;

public class TaskC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}
