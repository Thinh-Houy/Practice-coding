package PasswordValidate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetScreen extends JFrame {
    private JLabel passwordLabel = new JLabel();
    private JPasswordField passfield = new JPasswordField();
    private JButton validateBut = new JButton();
    private JButton exitBut = new JButton();
    GridBagConstraints getGrid = new GridBagConstraints();

    public static void main(String[] args) {
        new SetScreen().show();
    }

    public SetScreen() {
        setTitle("Password Validate");
        setResizable(false);
        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setLayout(new GridBagLayout());
        pack();
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int)(0.5*(screenSize.width-getWidth())),(int)(0.5*(screenSize.height-getHeight())),getWidth(),getHeight());

        passwordLabel.setText("Please Enter your password");
        passwordLabel.setOpaque(true);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,14));
        passwordLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        passwordLabel.setForeground(Color.red);
        passwordLabel.setBackground(Color.green);
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getGrid.ipadx=30;
        getGrid.ipady=20;
        getGrid.gridx=0;
        getGrid.gridy=0;
        getGrid.insets=new Insets(5,20,5,20);
        getContentPane().add(passwordLabel,getGrid);

        passfield.setText("");
        passfield.setFont(new Font("Arial",Font.PLAIN,14));
        passfield.setColumns(15);
        getGrid.gridx=0;
        getGrid.gridy=1;
        getContentPane().add(passfield,getGrid);

        validateBut.setText("Validate");
        validateBut.setBackground(Color.CYAN);
        getGrid.gridx=0;
        getGrid.gridy=2;
        getContentPane().add(validateBut,getGrid);

        exitBut.setText("Exit");
        exitBut.setBackground(Color.MAGENTA);
        getGrid.gridx=0;
        getGrid.gridy=3;
        getContentPane().add(exitBut,getGrid);
        pack();

        runCode run=new runCode();
        validateBut.addActionListener(run);
        exitBut.addActionListener(run);

    }
    private class runCode implements ActionListener{
        final String passWord="Thinhhouy";
        int respont;
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == validateBut) {
                if(passfield.getText().equals(passWord)) {
                    JOptionPane.showMessageDialog(null, "You're passed security", "Access Granted", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(passfield.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"You're not input password yet\nPlease input the password","Warning",JOptionPane.QUESTION_MESSAGE);
                }
                else {
                    respont=JOptionPane.showConfirmDialog(null,"Incorrect Password_Try again","Access Denial",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                    if(respont == JOptionPane.YES_NO_OPTION){
                        passfield.setText("");
                        passfield.requestFocus();
                    }
                    else exitBut.doClick();

                }
            }
            else if(e.getSource()==exitBut) System.exit(0);
        }
    }
}
