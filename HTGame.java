import java.util.Random;
import java.util.Scanner;

public class HTGame {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // int  x = random.nextInt(6)+1;
        // double y = random.nextDouble(10);

        // System.out.println(x);
        // System.out.println(y);

        

        System.out.println("Select Head (1) or tails (0)  :");

        int choice = sc.nextInt();

        boolean outcome = random.nextBoolean();

        if(choice==1 && outcome==true) {
            System.out.println("You won");
        }

        else if (choice==0 && outcome==false) {
            System.out.println("You won");
        }

        else {
            System.out.println("You lost");
        }

    }
}
