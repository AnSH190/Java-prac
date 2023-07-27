import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers : ");
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        // String anme = "Ansh";
        // hello(anme);
        // System.out.println("|methhhod");
        // int x= 3;
        // int y=4;

        // int z = add(x, y);

        System.out.println(add(x, y));
    }
    static int add(int x,int y) {
        

        
        int z = x+y;
        return z;
    }
    // static void hello(String anme) {
    //     System.out.println("Hello!  " + anme);
    }

