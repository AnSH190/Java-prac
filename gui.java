import javax.swing.JOptionPane;

public class gui {
    
    public static void main(String[] args) {
        
        // GUI program 
        String username =  JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter your Password");

        String password2 = JOptionPane.showInputDialog("Enter your Password again");
        if (password.equals(password2)) {
            JOptionPane.showMessageDialog(null, "Welcome " + username);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password");
                }
                
        

    }
}
