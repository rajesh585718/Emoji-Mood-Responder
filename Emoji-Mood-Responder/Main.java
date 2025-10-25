import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoodResponder responder = new MoodResponder();

        System.out.println("💬 Welcome to the Emoji Mood Responder!");
        System.out.print("How are you feeling today? ");

        String mood = scanner.nextLine().toLowerCase().trim();
        String response = responder.getResponse(mood);

        System.out.println(response);
        scanner.close();
    }
}
