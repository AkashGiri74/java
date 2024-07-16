import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;

class Myframe implements ActionListener  {
      private JButton btl_login=null;
      private JLabel  lbl_username=null;
      private JTextField  Txt_username=null;
      private JTextField  Txt_pass=null;
      JFrame myframe;


      Myframe()
      {
        myframe = new JFrame("Login Page");
        myframe.setVisible(true);
        myframe.setSize(500, 200);
        myframe.getContentPane().setBackground(Color.cyan);
        myframe.setLocation(250, 250);
        myframe.setLayout(null);

        // Username label
        
        lbl_username = new JLabel("Username");
        myframe.add(lbl_username);
        lbl_username.setBounds(40, 10, 80, 50);
        lbl_username.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Username text boxho
        Txt_username = new JTextField();
        myframe.add(Txt_username);
        Txt_username.setBounds(150, 25, 80, 20);
        Txt_username.addKeyListener(new  KeyAdapter()
        {
                public void keyReleased(KeyEvent ke)
                {
                   String user_str=Txt_username.getText();
                   Txt_pass.setText(user_str);
                }
        });//

        // Password label
        JLabel lbl_password = new JLabel("Password");
        myframe.add(lbl_password);
        lbl_password.setBounds(40, 50, 80, 50);
        lbl_password.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Password text box
         Txt_pass = new JTextField();
        myframe.add(Txt_pass);
        Txt_pass.setBounds(150, 67, 80, 20);
        Txt_pass.addActionListener(this); // Add ActionListener to password field
     Txt_pass.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent e) {
        if (key.getKeytext( ke.getKeyvode()== "Enter") {
            
        }
      } );
   btl_login = new JButton("Login");
        myframe.add(btl_login);
        btl_login.setBounds(40, 100, 80, 20);
        btl_login.addActionListener(this);

        // Cancel button
        JButton btl_cancel = new JButton("Cancel");
        myframe.add(btl_cancel);
        btl_cancel.setBounds(200, 100, 80, 20);
        btl_cancel.addActionListener(this);
      }
    public static void main(String[] args) {

        Myframe myframe=new Myframe();
        
    }

//     /*class KeyDemo extends*/ KeyAdapter
//  {
//          public void keyReleased(KeyEvent ke)
//          {
//             String user_str=Txt_username.getText();
//             Txt_pass.setText(user_str);
//          }
//  }

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
             myframe.setVisible(false);//to access personal file 
             Personal.main(null);
              
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
// class KeyDemo extends KeyAdapter
//  {
//          public void keyReleased(KeyEvent ke)
//          {
//             String user_str=Txt_username.getText();
//             Txt_pass.setText(user_str);
//          }
//  }
