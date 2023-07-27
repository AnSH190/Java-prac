import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<Integer>();

        age.add(1);
        age.add(2);
        age.add(3);
        age.add(4);
        age.add(5);

        for (int i = 0; i<age.size(); i++){
            System.out.println(age.get(i));
        }
    }
}
