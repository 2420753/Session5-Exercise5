import java.util.Scanner;

public class Main {
    private static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        String[] userArray = new String[6];

        System.out.print("Enter the first Letter: ");
        userArray[0] = stdin.nextLine();

        System.out.print("Enter the second Letter: ");
        userArray[1] = stdin.nextLine();

        System.out.print("Enter the third Letter: ");
        userArray[2] = stdin.nextLine();

        System.out.print("Enter the fourth Letter: ");
        userArray[3] = stdin.nextLine();

        System.out.print("Enter the fifth Letter: ");
        userArray[4] = stdin.nextLine();

        System.out.print("Enter the sixth Letter: ");
        userArray[5] = stdin.nextLine();


        for (int i = userArray.length - 1; i >= 0; i--) {
            System.out.println("Index: " + i + " " + userArray[i]);
        }

    }
}