import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.println("Enter your age : ");
        age = scanner.nextInt();

        if (age >= 50) {
            System.out.println("You are old person.");
        } else if (age >= 18 && age <= 50) {
            System.out.println("You are a Adult.");
        } else if (age < 18) {
            System.out.println("You are a child.");
        } else {
            System.out.println("enter a valid age.");
        }

    }
}
