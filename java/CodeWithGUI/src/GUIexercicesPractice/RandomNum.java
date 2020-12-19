package GUIexercicesPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomNum extends JFrame {
    JLabel screen=new JLabel();
    JButton clickBut=new JButton();
    JButton exitBUt=new JButton();
    GridBagConstraints getGrid=new GridBagConstraints();


    public static void main(String[] args) {
        new RandomNum().show();

    }
    public RandomNum(){
        //set the screen
        super("Random number");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setLayout(new GridBagLayout());


        screen.setText("Random Number: ");
        getGrid.gridx=0;
        getGrid.gridy=0;
        getContentPane().add(screen,getGrid);
        clickBut.setText("Click");
        getGrid.gridx=0;
        getGrid.gridy=1;
        getContentPane().add(clickBut,getGrid);
        exitBUt.setText("Exit");
        getGrid.gridx=0;
        getGrid.gridy=3;
        getContentPane().add(exitBUt,getGrid);


        handlerclass handle=new handlerclass();
        clickBut.addActionListener(handle);
        exitBUt.addActionListener(handle);

    }
    private class handlerclass implements ActionListener{
        Random rand=new Random();
        ;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==clickBut){
                for(int i=1;i<=rand.nextInt(99999);i++)
                    screen.setText(new DecimalFormat("00000").format(i));


            }
            else if (e.getSource()==exitBUt)
                System.exit(0);
        }
    }
}
