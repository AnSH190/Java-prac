public class methoverloading {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int a = 40;

        System.out.println(add(x,y));
        System.out.println(add(x, y, z));
        System.out.println(add(x,y,z,a));
        
    }

    static int add(int x, int y) {
        System.out.println("#1");
        return x + y;
    }
    
    static int add(int x, int y, int z) {
        System.out.println("#2");
        return x + y + z;
    }
    static int add(int x, int y, int z, int a) {
        System.out.println("#3");
        return x + y + z + a;
    }
}
