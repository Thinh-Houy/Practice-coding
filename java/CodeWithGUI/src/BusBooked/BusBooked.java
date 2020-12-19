package BusBooked;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BusBooked extends JFrame {

    private JLabel destinationCityLabel=new JLabel();
    private JList cityList =new JList();
    private JScrollPane destinationScroller=new JScrollPane();
    private JLabel seatLocationLabel=new JLabel();
    private JComboBox seatBox=new JComboBox();
    private JLabel mealPreferenceLabel=new JLabel();
    private JComboBox mealPreferenceBox=new JComboBox();
    private JButton assignBut=new JButton();
    private JButton exitBut=new JButton();

    private GridBagConstraints getGrid=new GridBagConstraints();


    public static void main(String[] args) {
        new BusBooked().show();

    }
    public BusBooked(){
        // set the screen
        setTitle("Flight Planner");
        setResizable(true);
       // setSize(500,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                exitForm(e);
            }
        });
        getContentPane().setLayout(new GridBagLayout());
        pack();

        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int)(0.5*(screenSize.width-getWidth())),(int)(0.5*(screenSize.height-getHeight())),getWidth(),getHeight());

    // set Destination
        destinationCityLabel.setText("Destination City  ");
        getGrid.gridx=0;
        getGrid.gridy=0;
        getGrid.insets=new Insets(10,0,0,0);
        getContentPane().add(destinationCityLabel,getGrid);
        destinationScroller.setPreferredSize(new Dimension(150,100));
        destinationScroller.setViewportView(cityList);
        getGrid.gridx=0;
        getGrid.gridy=1;
        getGrid.insets=new Insets(10,10,10,10);
        getContentPane().add(destinationScroller,getGrid);

        DefaultListModel citylistModel=new DefaultListModel();
        citylistModel.addElement("None");
        citylistModel.addElement("Banteay Meanchey");
        citylistModel.addElement("Battambang");
        citylistModel.addElement("Kampong Cham");
        citylistModel.addElement("KamPong Chhnang");
        citylistModel.addElement("KamPong Speu");
        citylistModel.addElement("KamPong Thom");
        citylistModel.addElement("Kom Pot");
        citylistModel.addElement("Kraches");
        citylistModel.addElement("Phnom Penh");
        citylistModel.addElement("Preah Vihear");
        citylistModel.addElement("Prey Veng");
        citylistModel.addElement("Pursat");
        citylistModel.addElement("Ratanak Kiri");
        citylistModel.addElement("Siem Reap");
        citylistModel.addElement("Preah Sihanouk");
        citylistModel.addElement("Stung Treng");
        citylistModel.addElement("Svay Rieng");
        citylistModel.addElement("Takeo");
        citylistModel.addElement("Oddar Meanchey");
        citylistModel.addElement("Kep");
        citylistModel.addElement("Pailin");
        citylistModel.addElement("Tboung Khmum");
        cityList.setModel(citylistModel);
        cityList.setSelectedIndex(0);


    // set seat location
        seatLocationLabel.setText("Seat Location  ");
        getGrid.gridx=1;
        getGrid.gridy=0;
        getContentPane().add(seatLocationLabel,getGrid);
        seatBox.setBackground(Color.white);
        getGrid.gridx=1;
        getGrid.gridy=1;
        getGrid.insets=new Insets(10,10,0,10);
        getGrid.anchor=GridBagConstraints.NORTH;
        getContentPane().add(seatBox,getGrid);
        for(int i=1;i<=30;i++){
            seatBox.addItem(String.valueOf(i));
        }
        seatBox.setSelectedIndex(0);

    // set meal preference
        mealPreferenceLabel.setText("Meal Preference");
        getGrid.gridx=2;
        getGrid.gridy=0;
        getContentPane().add(mealPreferenceLabel,getGrid);
        mealPreferenceBox.setEditable(true);
        getGrid.gridx=2;
        getGrid.gridy=1;
        getGrid.insets=new Insets(10,10,0,10);
        getGrid.anchor=GridBagConstraints.NORTH;
        getContentPane().add(mealPreferenceBox,getGrid);

        mealPreferenceBox.addItem("Samlor Kako");
        mealPreferenceBox.addItem("sour soup");
        mealPreferenceBox.addItem("Samor Prohal");
        mealPreferenceBox.addItem("Samlor Trakoun");
        mealPreferenceBox.addItem("Trey Chean");
        mealPreferenceBox.addItem("Prahok Dot");
        mealPreferenceBox.addItem("Chhar Kdav");
        mealPreferenceBox.addItem("Chhar Banle");
        mealPreferenceBox.addItem("Nham");
        mealPreferenceBox.setSelectedItem("No Preference");


    // set buttons
        assignBut.setText("Assign");
        assignBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                assignButPerform(e);
            }
        });
        getGrid.gridx=1;
        getGrid.gridy=3;
        getContentPane().add(assignBut,getGrid);
        exitBut.setText("Exit");
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButPerform(e);
            }
        });
        getGrid.gridx=1;
        getGrid.gridy=4;
        getContentPane().add(exitBut,getGrid);

        pack();

    }
    private void exitButPerform (ActionEvent e){
        System.exit(0);
    }

    private void assignButPerform(ActionEvent e){
        if(cityList.getSelectedValue()=="None"){
            JOptionPane.showMessageDialog(null,"You haven't select your destination yet\n Please select your destination.","Infromation",JOptionPane.WARNING_MESSAGE);
        }
        else {
            String message;
            message = "Destination to: " + cityList.getSelectedValue();
            message += "\nSeat Number: " + ((int) seatBox.getSelectedIndex() + 1);
            message += "\nMeal Preference: " + mealPreferenceBox.getSelectedItem();

            JOptionPane.showConfirmDialog(null, message, "Your Booked information", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void exitForm(WindowEvent e){
        System.exit(0);
    }


}
