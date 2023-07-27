public class stringmethods {
    public static void main(String[] args) {
        
        String name = "Ansh";

        boolean result = name.equals("ansh");
        boolean result1 = name.equalsIgnoreCase("ansh");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println(result);
        System.out.println(result1);
        System.out.println("-----------------------------");

        int len = name.length();
        System.out.println(len);
        System.out.println("-----------------------------");

        char r1 = name.charAt(0);
        char r2 = name.charAt(1);
        char r3 = name.charAt(2);
        char r4 = name.charAt(3);

        System.out.print(r1);
        System.out.print(r2);
        System.out.print(r3);
        System.out.print(r4);
        System.out.println();
        System.out.println("-----------------------------");

        int ind = name.indexOf("A");
        int ind1 = name.indexOf("n");
        int ind2 = name.indexOf("s");
        int ind3 = name.indexOf("h");

        System.out.println(ind);
        System.out.println(ind1);
        System.out.println(ind2);
        System.out.println(ind3);
        System.out.println("-----------------------------");

        boolean emp = name.isEmpty();
        System.out.println(emp);
        System.out.println("-----------------------------");

        String upper = name.toUpperCase();
        System.out.println(upper);
        System.out.println("-----------------------------");

        String lower = name.toLowerCase();
        System.out.println(lower);

        System.out.println("-----------------------------");

        String replace = name.replace("n", "m");
        System.out.println(replace);
    }
}
