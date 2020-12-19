package SavingAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SavingAccount extends JFrame {
    // declare the label
    private JLabel mDepost=new JLabel();
    private JLabel yInterrest=new JLabel();
    private JLabel numOfMonth=new JLabel();
    private JLabel finalBalance=new JLabel();

    // Declare the textfield
    private JTextField textDepost=new JTextField();
    private JTextField textInterrest=new JTextField();
    private JTextField textNumMonth=new JTextField();
    private JTextField textFinalBalance=new JTextField();

    // Declare the buttons
    private JButton calculate=new JButton();
    private JButton exitBut=new JButton();
    private JButton clearBut=new JButton();

    // Declare the grid layout
    GridBagConstraints getGrid=new GridBagConstraints();

    public static void main(String[] args) {
        new SavingAccount().show();
    }
    // Build the form of the screen
    public SavingAccount(){
        // Set the screen
        setTitle("Saving Account");
        setSize(500,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setLayout(new GridBagLayout());

        // set Label
        mDepost.setText("Month Depost");
        getGrid.gridx=0;
        getGrid.gridy=0;
        getContentPane().add(mDepost,getGrid);
        yInterrest.setText("Years Interrest");
        getGrid.gridx=0;
        getGrid.gridy=1;
        getContentPane().add(yInterrest,getGrid);
        numOfMonth.setText("Number of Month");
        getGrid.gridx=0;
        getGrid.gridy=2;
        getContentPane().add(numOfMonth,getGrid);
        finalBalance.setText("Final Balance");
        getGrid.gridx=0;
        getGrid.gridy=3;
        getContentPane().add(finalBalance,getGrid);

        // set the buttons
        calculate.setText("Calculate");
        getGrid.gridx=1;
        getGrid.gridy=4;
        getContentPane().add(calculate,getGrid);
        clearBut.setText("Clear");
        getGrid.gridx=1;
        getGrid.gridy=5;
        getContentPane().add(clearBut,getGrid);
        exitBut.setText("Exit");
        getGrid.gridx=1;
        getGrid.gridy=6;
        getContentPane().add(exitBut,getGrid);

        // set the textfield and use setColumn to set size of textfield
        textDepost.setText("");
        textDepost.setColumns(15);
        getGrid.gridx=2;
        getGrid.gridy=0;
        getContentPane().add(textDepost,getGrid);
        textInterrest.setText("");
        textInterrest.setColumns(15);
        getGrid.gridx=2;
        getGrid.gridy=1;
        getContentPane().add(textInterrest,getGrid);
        textNumMonth.setText("");
        textNumMonth.setColumns(15);
        getGrid.gridx=2;
        getGrid.gridy=2;
        getContentPane().add(textNumMonth,getGrid);
        textFinalBalance.setText("");
        textFinalBalance.setColumns(15);
        getGrid.gridx=2;
        getGrid.gridy=3;
        getContentPane().add(textFinalBalance,getGrid);

        // set the action
        builder build=new builder();
        calculate.addActionListener(build);
        exitBut.addActionListener(build);
        clearBut.addActionListener(build);
    }// end the class

    private class builder implements ActionListener{
        double Depost;
        double interres;
        double month;
        double finalbalance;
        double monthlyInterrest;

        public void actionPerformed(ActionEvent e) {
            // when user click on calculate button
            if(e.getSource()== calculate){
                Depost=Double.valueOf(textDepost.getText()).doubleValue();
                interres=Double.valueOf(textInterrest.getText()).doubleValue();
                month=Double.valueOf(textNumMonth.getText()).doubleValue();
                monthlyInterrest=interres/1200;
                finalbalance=Depost*(Math.pow((1+monthlyInterrest),month-1))/monthlyInterrest;
                textFinalBalance.setText(new DecimalFormat("0.00").format(finalbalance)+" $");
            }
            // clear textfield
            else if(e.getSource()==clearBut){
                textDepost.setText("");
                textInterrest.setText("");
                textNumMonth.setText("");
                textFinalBalance.setText("");
            }
            // when user clicked on exit button
            else if(e.getSource()==exitBut) System.exit(0);
        }
    }
}
