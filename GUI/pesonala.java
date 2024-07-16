   
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class PersonalInfoframe implements ActionListener
{   private JButton submitButton = null;
    private JButton cancelButton = null;
    private JTextField nameField = null;
    private JTextField ageField = null;
    private JTextField departmentField = null;
    private JFrame myFrame = null;

       PersonalInfoframe()
       {
        myFrame = new JFrame("Personal Information");
        myFrame.setVisible(true);
        myFrame.setSize(1200, 600);
        myFrame.getContentPane().setBackground(Color.pink);
        myFrame.setLocation(150, 150);
        myFrame.setLayout(null);

        Font font = new Font("SansSerif", Font.BOLD, 15);

        JLabel title = new JLabel("Personal Information");
        myFrame.add(title);
        title.setBounds(500, 5, 300, 100);
        title.setFont(font);

        JLabel name = new JLabel("Name : ");
        myFrame.add(name);
        name.setBounds(30, 50, 300, 100);
        name.setFont(font);

        nameField = new JTextField();
        myFrame.add(nameField);
        nameField.setBounds(100, 70, 200, 50);

        JLabel age = new JLabel("Age : ");
        myFrame.add(age);
        age.setBounds(30, 110, 300, 100);
        age.setFont(font);

        ageField = new JTextField();
        myFrame.add(ageField);
        ageField.setBounds(100, 150, 200, 50);

        JLabel department = new JLabel("Department : ");
        myFrame.add(department);
        department.setBounds(30, 200, 300, 100);
        department.setFont(font);

        departmentField = new JTextField();
        myFrame.add(departmentField);
        departmentField.setBounds(150, 230, 200, 50);

        submitButton = new JButton("Submit");
        myFrame.add(submitButton);
        submitButton.setBounds(80, 400, 100, 50);
        submitButton.addActionListener(this);

        cancelButton = new JButton("Cancel");
        myFrame.add(cancelButton);
        cancelButton.setBounds(200, 400, 100, 50);
        cancelButton.addActionListener(this);
       }
       
        public static void main(String[] args) {
            PersonalInfoframe p = new PersonalInfoframe();
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                String name = nameField.getText();
                String age = ageField.getText();
                String department = departmentField.getText();
                if (name.equalsIgnoreCase("Akash") && age.equals("20") && department.equalsIgnoreCase("TYBCS")) {
                    JOptionPane.showMessageDialog(null,
                            "Name: " + name + "\nAge: " + age + "\nDepartment: " + department);
                    JOptionPane.showMessageDialog(null, "Correct Information. Form Submitted");
    
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Information");
                    nameField.setText("");
                    ageField.setText("");
                    departmentField.setText("");
                }
            } else {
                myFrame.dispose();
     }
       
   
}
}
    
