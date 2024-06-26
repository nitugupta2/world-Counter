import java.awt.*;           // It is use to * because Fix: import java.util.Scanner
import javax.swing.*;  
import java.awt.event.*;  

public class CharCount extends JFrame implements ActionListener 
{  
    JLabel lb1, lb2, lb3, promptLabel;  
    JTextArea ta;  
    JButton submitButton, clearButton, padButton, textButton;  

    CharCount()                                                   // It is use to Charecter Counter
    {  
        super("Char Word Count Tool - JTP");  

        promptLabel = new JLabel("Enter your String Here:");  
        promptLabel.setBounds(50, 20, 200, 20);  
          
        lb1 = new JLabel("Characters (with spaces): ");  
        lb1.setBounds(50, 350, 200, 20);  

        lb2 = new JLabel("Characters (without spaces): ");         // Bounds JLLabel1
        lb2.setBounds(50, 380, 200, 20);  

        lb3 = new JLabel("Words: ");                               // Bounds JTLabe1
        lb3.setBounds(50, 410, 200, 20);  
          
        ta = new JTextArea();  
        ta.setBounds(50, 50, 500, 200);  
           
        submitButton = new JButton("Submit");                         
        submitButton.setBounds(50, 270, 80, 30);  
        submitButton.addActionListener(this);  
      
        clearButton = new JButton("Clear");  
        clearButton.setBounds(140, 270, 80, 30);  
        clearButton.addActionListener(this);  
  
        padButton = new JButton("Pad Color");  
        padButton.setBounds(230, 270, 110, 30);  
        padButton.addActionListener(this);  
  
        textButton = new JButton("Text Color");  
        textButton.setBounds(350, 270, 110, 30);  
        textButton.addActionListener(this);  
  
        add(promptLabel);  
        add(lb1);  
        add(lb2);  
        add(lb3);  
        add(ta);  
        add(submitButton);  
        add(clearButton);  
        add(padButton);  
        add(textButton);  
          
        setSize(600, 500);
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e) {  
        if (e.getSource() == submitButton) {  
            String text = ta.getText();  
            lb1.setText("Characters (with spaces): " + text.length());  
            lb2.setText("Characters (without spaces): " + text.replace(" ", "").length());  
            String words[] = text.split("\\s+");  
            lb3.setText("Words: " + words.length);  
        } else if (e.getSource() == clearButton) {  
            ta.setText("");  
            lb1.setText("Characters (with spaces): ");  
            lb2.setText("Characters (without spaces): ");  
            lb3.setText("Words: ");  
        } else if (e.getSource() == padButton) {  
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);  
            ta.setBackground(c);  
        } else if (e.getSource() == textButton) {  
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);  
            ta.setForeground(c);  
        }  
    }  
    
    public static void main(String[] args) {  
        new CharCount();  
    }  
}
