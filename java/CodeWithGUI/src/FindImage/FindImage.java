package FindImage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class FindImage extends JFrame {
    JLabel label0 = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel[] choiceLabel = new JLabel[6];
    ImageIcon icon1 = new ImageIcon("E:/me.png");
    JButton playBut = new JButton();
    JButton exitBut=new JButton();
    JLabel score=new JLabel();
    int burgerLocation;
    Random myRandom = new Random();
    int point=0;

    public static void main(String args[]) {
// create frame
        new FindImage().show();
    }

    public FindImage() {
// frame constructor
        setTitle("Find the Image");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());
// position controls
        GridBagConstraints gridConstraints;
        choiceLabel[0] = label0;
        choiceLabel[1] = label1;
        choiceLabel[2] = label2;
        choiceLabel[3] = label3;
        choiceLabel[4] = label4;
        choiceLabel[5] = label5;
        for (int i = 0; i < 6; i++) {
            gridConstraints = new GridBagConstraints();
            choiceLabel[i].setPreferredSize(new Dimension(icon1.getIconWidth(), icon1.getIconHeight()));
            choiceLabel[i].setOpaque(true);
            choiceLabel[i].setBackground(Color.RED);
            gridConstraints.gridx = i;
            gridConstraints.gridy = 0;
            gridConstraints.insets = new Insets(10, 10, 10, 10);
            getContentPane().add(choiceLabel[i], gridConstraints);
            choiceLabel[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    labelMouseClicked(e);
                }
            });
        }
        playBut.setText("Play Again");
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.insets = new Insets(10, 10, 10, 10);
        getContentPane().add(playBut, gridConstraints);
        playBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newButtonActionPerformed(e);
            }
        });
        exitBut.setText("Exit");
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButDo(e);
            }
        });
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=3;
        getContentPane().add(exitBut,gridConstraints);
        score.setText("Score:  "+point);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=2;
        gridConstraints.gridy=3;
        getContentPane().add(score,gridConstraints);

        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); setBounds((int) (0.5*(screenSize.width - getWidth())), (int) (0.5*(screenSize.height - getHeight())), getWidth(), getHeight());
// start first game
        playBut.doClick();



    }
    private void labelMouseClicked(MouseEvent e) {
        Component clickedComponent = e.getComponent(); int choice;
        for (choice = 0; choice < 6; choice++) {
            if (clickedComponent == choiceLabel[choice]) {
                break;
            }
        }
        choiceLabel[choice].setBackground(Color.WHITE);
        if (choice == burgerLocation) {
            choiceLabel[choice].setIcon(icon1);
            playBut.setEnabled(true);
            point++;
            score.setText("Score:  "+point);
        }
    }
    private void newButtonActionPerformed(ActionEvent e) {
// clear boxes and hide burger
        for (int i = 0; i <6; i++) {
            choiceLabel[i].setIcon(null);
            choiceLabel[i].setBackground(Color.RED); }
        burgerLocation = myRandom.nextInt(6);
        playBut.setEnabled(false);
    }
    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }
    private void exitButDo(ActionEvent e){
        System.exit(0);
    }
}