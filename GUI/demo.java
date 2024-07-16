import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
class MyFrame
{
public static void main(String[] args)
   {
      JFrame myframe=new JFrame("Login Frame");
      myframe.setVisible(true);
      myframe.setSize(500,200);
    //   myframe.setTitle("Login Frame");
    //   myframe.setBackground(Color.black);
      myframe.getContentPane().setBackground(Color.pink);
      myframe.setLocation(250, 250);
      myframe.setLayout(null);
      JLabel lbl_username=new JLabel("username");
      myframe.add(lbl_username);
      lbl_username.setBounds(10, 10, 80, 50);
   }
}
    