package StopWatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch extends JFrame {
    // declear buttons
    private JButton startBut = new JButton();
    private JButton stopBut = new JButton();
    private JButton exitBut = new JButton();

    // declear label
    private JLabel startTime = new JLabel();
    private JLabel stopTime = new JLabel();
    private JLabel elapTime = new JLabel();

    // declear textField
    private JTextField text1 = new JTextField();
    private JTextField text2 = new JTextField();
    private JTextField text3 = new JTextField();

    // declear the current time
    private long starttime;
    private long stoptime;
    private double elaptime;

    // set the layout on the screen
    private GridBagConstraints getGrid = new GridBagConstraints();

    // the run main class
    public static void main(String[] args) {
        new StopWatch().show();
    } // end main

    // set the elements onto the screen
    public StopWatch() {
        // set Screen
        setTitle("Stop Watch");
        setSize(500, 200);
        getContentPane().setLayout(new GridBagLayout());

        // set button
        startBut.setText("Start Button");
        getGrid.gridx = 0;
        getGrid.gridy = 0;
        getContentPane().add(startBut, getGrid);
        stopBut.setText("Stop Button");
        getGrid.gridx = 0;
        getGrid.gridy = 1;
        getContentPane().add(stopBut, getGrid);
        exitBut.setText("Exit");
        getGrid.gridx = 0;
        getGrid.gridy = 2;
        getContentPane().add(exitBut, getGrid);

        // set Label
        startTime.setText("Start Time***");
        getGrid.gridx = 1;
        getGrid.gridy = 0;
        getContentPane().add(startTime, getGrid);
        stopTime.setText("Stop Time***");
        getGrid.gridx = 1;
        getGrid.gridy = 1;
        getContentPane().add(stopTime, getGrid);
        elapTime.setText("ElapsTime");
        getGrid.gridx = 1;
        getGrid.gridy = 2;
        getContentPane().add(elapTime, getGrid);

        // set text
        text1.setText("");
        text1.setColumns(20); // set the size of text
        getGrid.gridx = 2;
        getGrid.gridy = 0;
        getContentPane().add(text1, getGrid);
        text2.setText("");
        text2.setColumns(20);
        getGrid.gridx = 2;
        getGrid.gridy = 1;
        getContentPane().add(text2, getGrid);
        text3.setText("");
        text3.setColumns(10);
        getGrid.gridx = 2;
        getGrid.gridy = 2;
        getContentPane().add(text3, getGrid);

        // get action from buttons
        handleclass handle = new handleclass();
        startBut.addActionListener(handle);
        stopBut.addActionListener(handle);
        exitBut.addActionListener(handle);
    } // end StopWatch clss


    // the action class
    private class handleclass implements ActionListener {
        public void actionPerformed(ActionEvent e) {    // in ActionListener class must call this funtion
            // start timing
            if(e.getSource() == startBut) {
                starttime = System.currentTimeMillis();
                text1.setText(String.valueOf(starttime)+" ms");
                text2.setText("");
                text3.setText("");
            }

            // stop timing and elaptime on the textfield
            else if(e.getSource() == stopBut){
            stoptime = System.currentTimeMillis();
            text1.setText(String.valueOf(starttime)+" ms");
            elaptime=(stoptime-starttime)/1000.0;
            text2.setText(String.valueOf(stoptime)+" ms");
            text3.setText(String.valueOf(elaptime)+"s");
            }

            // exit the program
            else if(e.getSource() == exitBut)
                System.exit(0);
            }
        }
}
//}

