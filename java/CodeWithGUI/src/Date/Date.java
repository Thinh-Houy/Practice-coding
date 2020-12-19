package Date;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.Collections;

public class Date extends JFrame {
    private JSpinner monthSpinner=new JSpinner();
    private JSpinner daySpinner=new JSpinner();
    private JLabel monthLabel=new JLabel();
    private JButton exitBut=new JButton();
    GridBagConstraints getGrid=new GridBagConstraints();

    String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int days;

    public static void main(String[] args) {
        new Date().show();
    }
    public Date(){
        setTitle("Date Input");
        setResizable(true);
        setSize(300,300);
        getContentPane().setLayout(new GridBagLayout());
        getContentPane().setBackground(Color.MAGENTA);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }
        });

        monthSpinner.setModel(new SpinnerListModel(months));
        monthSpinner.setPreferredSize(new Dimension(150,100));
        monthSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                monthsChange(e);
            }
        });
        getGrid.gridx=0;
        getGrid.gridy=0;
        getGrid.insets=new Insets(10,10,0,10);
        getContentPane().add(monthSpinner,getGrid);
        SpinnerNumberModel spin=new SpinnerNumberModel(1,1,31,1);
        daySpinner.setModel(spin);
        daySpinner.setPreferredSize(new Dimension(100,100));
        daySpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                daysChang(e);
            }
        });
        getGrid.gridx=2;
        getGrid.gridy=0;
        getGrid.insets=new Insets(10,10,0,10);
        getContentPane().add(daySpinner,getGrid);

        monthLabel.setText("January 1");
        getGrid.gridx=1;
        getGrid.gridy=1;
        getContentPane().add(monthLabel,getGrid);

        exitBut.setText("Exit");
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButPerform(e);
            }
        });
        getGrid.gridx=1;
        getGrid.gridy=3;
        getContentPane().add(exitBut,getGrid);
    }
    private void monthsChange(ChangeEvent e){
        String message;
        message=String.valueOf(monthSpinner.getValue())+"  "+daySpinner.getValue();
        monthLabel.setText(message);
        getGrid.gridx=1;
        getGrid.gridy=1;
        getContentPane().add(monthLabel,getGrid);
    }
    private void daysChang(ChangeEvent e){
        String message;
        message=String.valueOf(monthSpinner.getValue())+"  "+daySpinner.getValue();
        monthLabel.setText(message);
        getGrid.gridx=1;
        getGrid.gridy=1;
        getContentPane().add(monthLabel,getGrid);
    }
    private void exitButPerform(ActionEvent e){
        System.exit(0);
    }
}
