import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton convertButton;
    private JTextField textField1;
    private JPanel mainPanel;
    private JLabel fahr;
    private JLabel celsius;
    private JButton changeButton;
    private JLabel veryHot;
    private JLabel hot;
    private JLabel warm;
    private JLabel cold;
    private JLabel veryCold;
    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Conversor Celsius/Fahrenheit");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (celsius.getText().equals("Celsius")){
                float converter = (float) ((Float.parseFloat(textField1.getText()))*1.8+32);
                fahr.setText(converter + " Fahrenheit");
                    if (converter >= 93.0){
                        fahr.setForeground(Color.RED);
                    }else if (converter >=80){
                        fahr.setForeground(Color.ORANGE);
                    }else if (converter >=69){
                        fahr.setForeground(Color.GREEN);
                    }else if (converter >=50){
                        fahr.setForeground(Color.CYAN);
                    }else{fahr.setForeground(Color.BLUE);}
                }else{
                    float converter = (float) (((Float.parseFloat(textField1.getText()))-32)*0.5555555555555);
                    fahr.setText(converter + " Celsius");
                        if (converter >= 33.87){
                            fahr.setForeground(Color.RED);
                        }else if (converter >=26.65){
                            fahr.setForeground(Color.ORANGE);
                        }else if (converter >=20.54){
                            fahr.setForeground(Color.GREEN);
                        }else if (converter >=10){
                            fahr.setForeground(Color.CYAN);
                        }else{fahr.setForeground(Color.BLUE);}
                    }
                }
            }
        );
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (celsius.getText().equals("Celsius")){
                    fahr.setForeground(Color.BLACK);
                    celsius.setText("Fahrenheit");
                    fahr.setText("Celsius");
                    textField1.setText("");
                }else{
                    fahr.setForeground(Color.BLACK);
                    celsius.setText("Celsius");
                    fahr.setText("Fahrenheit");
                    textField1.setText("");
                    }
            }
        });
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
