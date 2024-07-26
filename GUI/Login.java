// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JButton;
// import javax.swing.JTextField;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;



// import java.awt.Color;
// import java.awt.Font;
// class Demo implements ActionListener
// {
// public static void main(String[] args)
//    {
//       JFrame myframe=new JFrame("Login Page");
//       myframe.setVisible(true);
//       myframe.setSize(500,200);
//     //   myframe.setTitle("Login Frame");
//     //   myframe.setBackground(Color.black);
//       myframe.getContentPane().setBackground(Color.pink);
//       myframe.setLocation(250, 250);
//       myframe.setLayout(null);

//     //user name label
//       JLabel lbl_username=new JLabel("username");
//       myframe.add(lbl_username);
//       lbl_username.setBounds(40, 10, 80, 50);
//       lbl_username.setFont(new Font("Helvetica", Font.ITALIC, 16));

      
//       //username text box
//       JTextField username=new JTextField();
//       myframe.add(username);
//       username.setBounds(150, 25, 80, 20);
//      //password label
//       JLabel lbl_password=new JLabel("Password");
//       myframe.add(lbl_password);
//       lbl_password.setBounds(40, 50, 80, 50);
//       lbl_password.setFont(new Font("Helvetica", Font.ITALIC, 16));
//      ///password text box
//       JTextField pass=new JTextField();
//       myframe.add(pass);
//       pass.setBounds(150, 67, 80, 20);
//       //login button
//       JButton lbl_login=new JButton("Login");
//       myframe.add(lbl_login);
//       lbl_login.setBounds(40, 100, 80, 20);
//       lbl_login.addActionListener(new Demo());
      
//        //cancel button
//       JButton lbl_cancel=new JButton("Cancel");
//       myframe.add(lbl_cancel);
//       lbl_cancel.setBounds(200, 100, 80, 20);
//    }

//    public void actionPerform(ActionEvent ae) {
//     System.out.println("login button clik");
//    }
// }

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;

class Myframe implements ActionListener {
      private JButton btl_login=null;
      private JLabel  lbl_username=null;
      private JTextField  Txt_username=null;
      private JTextField  Txt_pass=null;
      JFrame myframe;
      JComboBox cb;


      Myframe()
      {
        myframe = new JFrame("Login Page");
        myframe.setVisible(true);
        myframe.setSize(500, 200);
        myframe.getContentPane().setBackground(Color.MAGENTA);
        myframe.setLocation(250, 250);
        myframe.setLayout(null);

        // Username label
        
        lbl_username = new JLabel("Username");
        myframe.add(lbl_username);
        lbl_username.setBounds(40, 10, 80, 50);
        lbl_username.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Username text box
        Txt_username = new JTextField();
        myframe.add(Txt_username);
        Txt_username.setBounds(150, 25, 80, 20);
        Txt_username.addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent e) {
              if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                  Txt_pass.requestFocus();
              }
          }
      });

        // Password label
        JLabel lbl_password = new JLabel("Password");
        myframe.add(lbl_password);
        lbl_password.setBounds(40, 50, 80, 50);
        lbl_password.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Password text box
         Txt_pass = new JTextField();
        myframe.add(Txt_pass);
        Txt_pass.setBounds(150, 67, 80, 20);

        // Login button
         btl_login = new JButton("Login");
        myframe.add(btl_login);
        btl_login.setBounds(40, 100, 80, 20);
        btl_login.addActionListener(this);

        // Cancel button
        JButton btl_cancel = new JButton("Cancel");
        myframe.add(btl_cancel);
        btl_cancel.setBounds(200, 100, 80, 20);
        btl_cancel.addActionListener(this);

        //  cb=new JComboBox();
        //  cb.addItem("fe");
        //  cb.addItem("se");
        //  cb.addItem("te");
        // JLabel department = new JLabel("Department : ");
        // myframe.add(department);
        // department.add(cb);
        // department.setBounds(30, 200, 300, 100);
        // department.setFont(font);
      }
    public static void main(String[] args) {

        Myframe myframe=new Myframe();
        
    }

    public void actionPerformed(ActionEvent ae)
     {
        
        if (ae.getSource()==btl_login)
        // if (ae.getActionCommand()=="Login")
        {  String user=Txt_username.getText();
          String pass=Txt_pass.getText();
          if(user.equalsIgnoreCase("Akash") && pass.equals("8010236068"))
           {
            //  System.out.println("login success ");
             JOptionPane.showMessageDialog(null,"Login success");
            //  myframe.setVisible(false);//to access personal file 
            //  Personal1.main(null);
              
           }
           else
          {
            JOptionPane.showMessageDialog(null,"Login failed");
            Txt_username.setText("");
            Txt_pass.setText("");
          }
            System.out.println("login button click");
        }
        else
        {  
           
           System.out.println("cancle button click");
        }

        

    }
    
}

    
