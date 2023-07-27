import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your fav foof ");
        String food = scanner.nextLine();

        System.out.println("Heloo "+name );
        System.out.println("You are "+age+" old");
        System.out.println("Your fav food is "+food);

    }
}
