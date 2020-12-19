package GUIexercicesPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveList extends JFrame{
    private JLabel label1=new JLabel();
    private JLabel label2=new JLabel();
    private JList list1=new JList();
    private JList list2=new JList();
    private JButton moveBut=new JButton();
    private JButton removeBut=new JButton();
    private JButton exitBut=new JButton();
    private JScrollPane scrollpane1=new JScrollPane();
    private JScrollPane scrollPane2=new JScrollPane();

    DefaultListModel listModel1=new DefaultListModel();
    DefaultListModel listModel2=new DefaultListModel();

    GridBagConstraints getGrid=new GridBagConstraints();

    public static void main(String[] args) {
        new MoveList().show();
    }
    private MoveList(){
        super("Move List");
        setResizable(true);
        setSize(300,300);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        getContentPane().setLayout(new GridBagLayout());

        label1.setText("List 1");
        label1.setFont(new Font("Arial",Font.BOLD,20));
        label1.setForeground(Color.red);
        getGrid.gridx=0;
        getGrid.gridy=0;
        //getGrid.insets=new Insets(10,10,0,10);
        getContentPane().add(label1,getGrid);
        scrollpane1.setPreferredSize(new Dimension(100,100));
        scrollpane1.setViewportView(list1);
        getGrid.gridx=0;
        getGrid.gridy=1;
        getContentPane().add(scrollpane1,getGrid);
        listModel1.addElement("School");
        listModel1.addElement("Home");
        listModel1.addElement("Hospital");
        listModel1.addElement("Pagoda");
        listModel1.addElement("Company");
        listModel1.addElement("Office");
        listModel1.addElement("Super Mall");
        listModel1.addElement("Market");
        listModel1.addElement("Shop");
        list1.setModel(listModel1);
        list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list1.setSelectedIndex(0);


        label2.setText("List 2");
        label2.setFont(new Font("Arial",Font.BOLD,20));
        label2.setForeground(Color.red);
        getGrid.gridx=2;
        getGrid.gridy=0;
        getContentPane().add(label2,getGrid);
        scrollPane2.setPreferredSize(new Dimension(100,100));
        scrollPane2.setViewportView(list2);
        getGrid.gridx=2;
        getGrid.gridy=1;
        getContentPane().add(scrollPane2,getGrid);

        listModel2.addElement("");
        list2.setModel(listModel2);
        //list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list2.setSelectedIndex(0);


        moveBut.setText("Move");
        getGrid.gridx=1;
        getGrid.gridy=3;
        getContentPane().add(moveBut,getGrid);
        moveBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveButPerform(e);
            }
        });
        removeBut.setText("Remove");
        getGrid.gridx=2;
        getGrid.gridy=3;
        getContentPane().add(removeBut,getGrid);
        removeBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeButPerform(e);
            }
        });
        exitBut.setText("Exit");
        getGrid.gridx=1;
        getGrid.gridy=4;
        getContentPane().add(exitBut,getGrid);
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButPerform(e);
            }
        });
    }
    private void moveButPerform(ActionEvent e){
        listModel2.addElement(list1.getSelectedValue());

    }
    private void removeButPerform(ActionEvent e){
        listModel2.removeElement(list2.getSelectedValue());
    }
    private void exitButPerform(ActionEvent e){
        System.exit(0);
    }
}
