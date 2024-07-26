import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.JButton;
 import javax.swing.JOptionPane;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

import javax.swing.JFrame;
 class myFrame  implements  ActionListener
{

    private JLabel lbl_username=null;
    private JTextField txt_username=null;

    private JLabel lbl_pass=null;
    private JTextField txt_pass=null;

    private JButton btn_login=null;
    private JButton btn_cancel=null;


      JFrame myFrame;
    myFrame()
    {
        myFrame=new JFrame();
        myFrame.setVisible(true);
        myFrame.setSize(500,500);
        myFrame.getContentPane().setBackground(Color.MAGENTA);
        myFrame.setLocation(250,250);
        myFrame.setLayout(null);//devach

        lbl_username=new JLabel("username");
        myFrame.add(lbl_username);
        lbl_username.setBounds(40,10,80,50);

        txt_username=new JTextField();
        myFrame.add(txt_username);
        txt_username.setBounds(150, 25, 80, 20);


        lbl_pass=new JLabel("password");
        myFrame.add(lbl_pass);
        lbl_pass.setBounds(40,50,80,50);

        txt_pass=new JTextField();
        myFrame.add(txt_pass);
        txt_pass.setBounds(150, 65, 80, 20);



        btn_login=new JButton("login");
        myFrame.add(btn_login);
        btn_login.setBounds(40,100,80,20);
        btn_login.addActionListener(this);

        btn_cancel=new JButton("cancel");
        myFrame.add(btn_cancel);
        btn_cancel.setBounds(200, 100, 80, 20);
        btn_cancel.addActionListener(this);





    }
    public static void main(String[] args)
    {    

        myFrame myFrame=new myFrame();
    

    }

    public void actionPerformed( ActionEvent ae)
    {
       if(ae.getSource()==btn_login)
       {  String s_username=txt_username.getText(); 
        String s_pass=txt_pass.getText(); 



           if(s_username.equalsIgnoreCase("Krushna") && s_pass.equalsIgnoreCase("123"))
          {
                   JOptionPane.showMessageDialog(null, "login scccesss");
                   myFrame.setVisible(false );
                   per.main(null);
           }
          else
           {
            JOptionPane.showMessageDialog(null, "login failed");
            }
        System.out.println("login butunn click");
       }
       else
       {
        System.out.println("cancel");
       }
    }
    
}
