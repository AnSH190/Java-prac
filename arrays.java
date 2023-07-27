public class arrays {
    public static void main(String[] args) {
        int[] age = {1,2,3,4,5,7,8,9};
        System.out.println(age[4]);

        // Another type to declare an array 
        int[] cars = new int[5];

        cars[0] = 1;
        cars[1] = 2;
        cars[2] = 3;
        cars[3] = 4;
        cars[4] = 5;

        System.out.println(cars[4]);

        for (int i = 0; i<cars.length; i++ ) {
            System.out.println(cars[i]);
        }
        for (int j = 0; j<age.length; j++ ) {
            System.out.println(age[j]);
        }
    }
}