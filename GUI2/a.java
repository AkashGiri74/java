import java.awt.Color;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
// import java.awt.Font;

class Myframe  implements  ActionListener 
 {
      ButtonGroup bg;
      JFrame myframe;
      JRadioButton rb;
      JRadioButton rb1;
      JComboBox <String> cb;

      Myframe()
      {
        myframe = new JFrame("Login Page");
        myframe.setVisible(true);
        myframe.setSize(500, 200);
        myframe.getContentPane().setBackground(Color.MAGENTA);
        myframe.setLocation(250, 250);
        myframe.setLayout(null);

        cb=new JComboBox<>();
        myframe.add(cb);
        cb.addItem("--select--");
        cb.addItem("FYBCS");
        cb.addItem("SYBCS");
        cb.addItem("TYBCS");
        cb.addItem("BCS");
        cb.setBounds(30, 30, 80, 40);


        bg=new ButtonGroup();
        rb=new JRadioButton("male");
        rb1=new JRadioButton("female");
        bg.add(rb);//ekach selct karat yeyil
        bg.add(rb1);
        rb.setSelected(true);//alredy
        myframe.add(rb);
        myframe.add(rb1);
        rb.setBounds(150, 30,80, 20);
        rb1.setBounds(250, 30,100, 20);
        rb.addActionListener(this);
        rb1.addActionListener(this);
           


      }


      public static void main(String[] args)
       {
          Myframe myframe=new Myframe();
      }


      public void actionPerformed(ActionEvent ae)
      {
        if(ae.getSource()==rb)
        {
           JOptionPane.showMessageDialog(null, "you are male");
        }
        else if(ae.getSource()==rb1)
        {
            JOptionPane.showMessageDialog(null, "you are female");  
        }
      }

       

    }
