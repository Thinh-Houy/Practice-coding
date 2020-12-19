package TemperatureConvertion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TemConversion extends JFrame {
    JScrollBar scroller=new JScrollBar();
    JLabel fahrenhietLabel=new JLabel();
    JLabel celsiusLabel=new JLabel();
    JTextField fahrenhietTextfield=new JTextField();
    JTextField celsiusTextfield=new JTextField();
    JPanel colorPanel=new JPanel();
    JButton exitBut=new JButton();
    boolean isHot=false;
    GridBagConstraints getGrid=new GridBagConstraints();

    public static void main(String[] args) {
        new TemConversion().show();
    }
    public TemConversion(){
        setTitle("Temperature Conversion");
        setResizable(false);
        getContentPane().setLayout(new GridBagLayout());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                exitForm(e);
            }
        });
        pack();
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int)(0.5*(screenSize.width-getWidth())),(int)(0.5*(screenSize.height-getHeight())),getWidth(),getHeight());

        fahrenhietLabel.setText("Fahrenheit");
        getGrid.gridx=0;
        getGrid.gridy=0;
        getGrid.insets=new Insets(0,10,0,0);
        getContentPane().add(fahrenhietLabel,getGrid);

        fahrenhietTextfield.setText("32.0");
        fahrenhietTextfield.setColumns(10);
        fahrenhietTextfield.setHorizontalAlignment(SwingConstants.CENTER);
        fahrenhietTextfield.setEditable(false);
        getGrid.gridx=2;
        getGrid.gridy=0;
        getContentPane().add(fahrenhietTextfield,getGrid);


        celsiusLabel.setText("Celsius");
        getGrid.gridx=0;
        getGrid.gridy=2;
        getGrid.insets=new Insets(0,10,0,0);
        getContentPane().add(celsiusLabel,getGrid);

        celsiusTextfield.setText("0.0");
        celsiusTextfield.setColumns(10);
        celsiusTextfield.setHorizontalAlignment(SwingConstants.CENTER);
        celsiusTextfield.setEditable(false);
        getGrid.gridx=2;
        getGrid.gridy=2;
        getContentPane().add(celsiusTextfield,getGrid);

        colorPanel.setBackground(Color.BLUE);
        colorPanel.setPreferredSize(new Dimension(280,40));
        getGrid.gridx=0;
        getGrid.gridy=1;
        getGrid.gridwidth=3;
        getContentPane().add(colorPanel,getGrid);

        scroller.setMaximum(1200);
        scroller.setMinimum(-600);
        scroller.getVisibleAmount();
        scroller.setBlockIncrement(10);
        scroller.setUnitIncrement(1);
        scroller.setValue(320);
        scroller.setOrientation(JScrollBar.HORIZONTAL);
        scroller.setPreferredSize(new Dimension(250,25));
        scroller.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                scrollerValueChange(e);
            }
        });
        colorPanel.add(scroller);

        exitBut.setText("Exit");
        getGrid.gridx=1;
        getGrid.gridy=3;
        getContentPane().add(exitBut,getGrid);
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButPerform(e);
            }
        });

        pack();
    }
    private void exitForm(WindowEvent e){
        System.exit(0);
    }
    private void scrollerValueChange(AdjustmentEvent e){
        double tempF,tempC;

        tempF=(double)scroller.getValue()/10;
        if(isHot && tempF<70){
            isHot=false;
            colorPanel.setBackground(Color.BLUE);
        }
        else if(!isHot && tempF>=70){
            isHot=true;
            colorPanel.setBackground(Color.red);
        }
        fahrenhietTextfield.setText(new DecimalFormat("0.00").format(tempF));
        tempC=(tempF-32)*5.0/9.0;
        celsiusTextfield.setText(new DecimalFormat("0.00").format(tempC));
    }
    private void exitButPerform(ActionEvent e){
        System.exit(0);
    }

}
