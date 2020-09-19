
package swinggui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TimesTable extends JFrame{
    private Container c;
    private JLabel imgLabel,label;
    private JTextField tf;
    private JTextArea ta;
    private JButton clear_button;
    private Font f;
    private ImageIcon img;
    
    TimesTable(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,920);
        this.setTitle("Times Table");
        this.setResizable(false);
        
        //Add Image
        img = new ImageIcon(getClass().getResource("timesTable1.jpg")); //Add to JFrame logo image
        this.setIconImage(img.getImage()); //set to JFrame logo image
        
        f = new Font("Arial", Font.BOLD,20);
        
        //Content Pane 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);
        
        imgLabel = new JLabel(img);
        imgLabel.setBounds(45,10,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
        label = new JLabel();
        label.setFont(f);
        label.setBounds(45,400,200,40);
        label.setForeground(Color.yellow);
        label.setText("Enter any number:");
        c.add(label);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(230,400,100,40);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf);
        
        clear_button = new JButton("Clear");
        clear_button.setFont(f);
        clear_button.setBounds(225,470,100,40);
        c.add(clear_button);
        
        ta = new JTextArea();
        ta.setFont(f);
        ta.setBounds(45,530,400,320);
        ta.setBackground(Color.GREEN);
        c.add(ta);
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                if(s.isEmpty()){
                   JOptionPane.showMessageDialog(null, "you didn't enter any number");
                }else{
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());
                    for (int i = 1; i <= 10; i++) {
                    int result = num*i;
                    String rslt = String.valueOf(result);
                    String n = String.valueOf(num);
                    String j = String.valueOf(i);
                    ta.append(n+" X "+j+" = "+rslt+"\n");
                } 
                }
            }
        });
        clear_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               tf.setText("");
               ta.setText("");
            }
        });   
    }
    
   /* public static void main(String[] args) {
        TimesTable times = new TimesTable();
        times.setVisible(true);
    }*/
}
