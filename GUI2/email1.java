
import  javax.swing.JFrame;
import  javax.swing.JLabel;
import  javax.swing.JTextField;
import  javax.swing.JButton;

import  java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class email1 implements ActionListener {
    JFrame myfFrame;
    JLabel lbl_email;
    JTextField txt_email;
    JButton btn_login;
    public email1() 
    {
     myfFrame=new JFrame();
     myfFrame.setVisible(true);
     myfFrame.setSize(500,500);
     myfFrame.getContentPane().setBackground(Color.MAGENTA);
    

    lbl_email=new JLabel("Email");
    myfFrame.add(lbl_email);
    lbl_email.setBounds(30, 10, 50, 40);
    
    txt_email=new JTextField();
    myfFrame.add(txt_email);
    txt_email.setBounds(50, 200, 50, 40);
    txt_email.addActionListener(this);


    btn_login=new JButton("Login");
    myfFrame.add(btn_login);
    btn_login.setBounds(100, 300, 69, 30);
    btn_login.addActionListener(this);


    }



    
 public static void main(String[] args) 
  {
     email1  e1=new email1();
  }  
 
  public void actionPerformed(ActionEvent ae)
  {  String email=txt_email.getText().trim();
      if(ae.getSource()=="Login")
      {
        if(email.contains("@"))
        {
            JOptionPane.showMessageDialog(null, "valid email id ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "invalid email id ");  
        }
      }
  }
 
}
