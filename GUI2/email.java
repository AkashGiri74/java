import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class email implements ActionListener
{   
    JLabel lbl_email;
    JLabel lbl_mno;
    JTextField txt_email;
    JTextField txt_mno;
    JButton btn_login;
    JButton btn_cancle;
    JFrame myFrame;



    email()
    {
        myFrame=new JFrame();
        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
        myFrame.setLocation(400, 200);
        myFrame.getContentPane().setBackground(Color.PINK);
        //FlowLayout, BorderLayout
        myFrame.setLayout(null);


        lbl_email =new JLabel("Email");
        myFrame.add(lbl_email);
        lbl_email.setBounds(30, 40, 50, 40);

        txt_email=new JTextField();
        myFrame.add(txt_email);
        txt_email.setBounds(69, 50, 100, 20);
        txt_email.addActionListener(this);

        lbl_mno =new JLabel("Mo.no");
        myFrame.add(lbl_mno);
        lbl_mno.setBounds(30, 65, 50, 40);
        

        txt_mno=new JTextField();
        myFrame.add(txt_mno);
        txt_mno.setBounds(69, 75, 100, 20);
        txt_mno.addActionListener(this);

        btn_login=new JButton("Login");
        myFrame.add(btn_login);
        btn_login.setBounds(90, 250, 90, 30);
        btn_login.addActionListener(this);


        btn_cancle=new JButton("Cancle");
        myFrame.add(btn_cancle);
        btn_cancle.setBounds(200, 250, 90, 30);
        btn_cancle.addActionListener(this);

        

    }
    public static void main(String[] args) {
        email Myframe=new email();
    }
    


public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == btn_login) {
        validateInputs();
    } else if (ae.getSource() == btn_cancle) {
        clearFields();
    }
}

private void validateInputs() {
    String email = txt_email.getText().trim();
    String mono = txt_mno.getText().trim();

    if (email.contains("@")) {
        JOptionPane.showMessageDialog(myFrame, "Valid email");
    } else {
        JOptionPane.showMessageDialog(myFrame, "Invalid email");
    }

    if (mono.length() == 10) {
        JOptionPane.showMessageDialog(myFrame, "Valid mobile number");
    } else {
        JOptionPane.showMessageDialog(myFrame, "Invalid mobile number");
    }
}

private void clearFields() {
    txt_email.setText("");
    txt_mno.setText("");
}

}
    
    
    
   
    


    

