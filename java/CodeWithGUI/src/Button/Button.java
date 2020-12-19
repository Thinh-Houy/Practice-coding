package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button extends JFrame {
    private JButton red;        // button name red
    private JButton custom;     // button name custom

    public static void main(String[] args) {
        new Button().show();
    }
    public Button(){
        // create a screen
        super("Thinh Houy");    // title of the screen
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // add the images
        Icon me=new ImageIcon(getClass().getResource("me.jpg"));
        Icon down=new ImageIcon(getClass().getResource("down.png"));

        // create the buttons
        red= new JButton("red Button",me); // set the red button
        red.setRolloverIcon(down);  // roll from me icon to down icon when mouse on this button
        add(red);       // add red to the screen
        custom=new JButton("Custom",down);        // set the custom button
        custom.setRolloverIcon(me); // roll from down icon to me icon when mouse on this button
        add(custom);        // add the custom button to the screen

        // to do action with the buttons
        handlerClass handler=new handlerClass();
        red.addActionListener(handler);
        custom.addActionListener(handler);

    }
    private class handlerClass implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,String.format(e.getActionCommand())); // to do action when user do something on the buttons
        }
    }
}
