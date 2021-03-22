import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JStudentRec2 extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3, lb4, lb5;
    JTextField tf1, tf2, tf4;
    JButton bt1, bt2, bt3, bt4;
    JTextArea ta;
    JRadioButton rb1, rb2;
    ButtonGroup bg = new ButtonGroup();

    JStudentRec2(){
       super("Demo");
       setSize(350, 350);
       setLayout(new FlowLayout());
       lb1 = new JLabel("STUDENT RECORD");
       lb2 = new JLabel("ID :");
       lb3 = new JLabel("NAME :");
       lb4 = new JLabel("SEX :");
       lb5 = new JLabel("SCORE :");
       tf1 = new JTextField(10);
       tf2 = new JTextField(10);
       rb1 = new JRadioButton("Male", true);
       rb2 = new JRadioButton("Female", false);
       tf4 = new JTextField(10);
       bt1 = new JButton("ADD");
       bt2 = new JButton("DEL");
       bt3 = new JButton("CLEAR");
       bt4 = new JButton("CLOSE");
       ta  = new JTextArea(5, 30);
       bg.add(rb1); bg.add(rb2);
       add(lb1);
       add(lb2); add(tf1);
       add(lb3); add(tf2);
       add(lb4); add(rb1); add(rb2);
       add(lb5); add(tf4);
       add(bt1); add(bt2); add(bt3); add(bt4);
       add(ta);

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       bt1.addActionListener(this);
       bt2.addActionListener(this);
       bt3.addActionListener(this);
       bt4.addActionListener(this);
    }
    public static void main(String args[]){
       new JStudentRec2();
    }
    public void actionPerformed(ActionEvent ae){
       String sex = "";
       if (rb1.isSelected() == true)
          sex = "Male";
       else
          sex = "Female";
       
       if (ae.getSource() == bt1){
          ta.append(tf1.getText() + ", " + tf2.getText() + ", " + sex + ", " + tf4.getText() + "\n\r");
       }
       if (ae.getSource() == bt2){
          ta.setText("");
       }
       if (ae.getSource() == bt3){
     tf1.setText("");
           tf2.setText("");
           rb1.setSelected(true);
           tf4.setText("");
       }
       if (ae.getSource() == bt4){
           System.exit(0);
       }
    }
}
