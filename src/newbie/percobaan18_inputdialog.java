package newbie;
import javax.swing.*;
public class percobaan18_inputdialog {
    public class R_InputDialog
    {
        public static void main(String[] args)
        {
            String name = JOptionPane.showInputDialog("what is your name");
            System.out.println("my name is " + name);
            System.exit(0);
        }
}
