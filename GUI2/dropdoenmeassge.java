import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class personal implements ActionListener, ItemListener {
    private JButton btl_submit = null;
    private JButton btl_cancel = null;
    private JTextField nameField = null;
    private JTextField ageField = null;
    private JTextField departmentField = null;
    private JFrame myFrame = null;
    JComboBox<String> cb;
    JComboBox<String> cb1;

    personal() {
        myFrame = new JFrame("Personal Information");
        myFrame.setVisible(true);
        myFrame.setSize(1200, 600);
        myFrame.getContentPane().setBackground(Color.CYAN);
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

        cb = new JComboBox<>();
        cb.addItem("se");
        cb.addItem("fe");
        cb.addItem("te");
        myFrame.add(cb);
        cb.setBounds(30, 300, 100, 30);
        cb.addActionListener(this);
        cb.addItemListener(this);

        String[] departments = { "fy", "sy", "ty" };
        cb1 = new JComboBox<>(departments);
        myFrame.add(cb1);
        cb1.setBounds(250, 300, 100, 30);
        cb1.addActionListener(this);
        cb1.addItemListener(this);

        JLabel department = new JLabel("Department : ");
        myFrame.add(department);
        department.setBounds(30, 200, 300, 100);
        department.setFont(font);

        departmentField = new JTextField();
        myFrame.add(departmentField);
        departmentField.setBounds(150, 230, 200, 50);

        btl_submit = new JButton("Submit");
        myFrame.add(btl_submit);
        btl_submit.setBounds(80, 400, 100, 50);
        btl_submit.addActionListener(this);

        btl_cancel = new JButton("Cancel");
        myFrame.add(btl_cancel);
        btl_cancel.setBounds(200, 400, 100, 50);
        btl_cancel.addActionListener(this);
    }

    public static void main(String[] args) {
        personal p = new personal();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btl_submit) {
            String name = nameField.getText();
            String age = ageField.getText();
            String department = departmentField.getText();
            if (name.equalsIgnoreCase("Akash") &&
                age.equals("20") && department.equalsIgnoreCase("TYBCS")) {
                JOptionPane.showMessageDialog(null,
                        "Name: " + name + "\nAge: " + age + "\nDepartment: " + department);
                JOptionPane.showMessageDialog(null, "Correct Information. Form Submitted");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Information");
                nameField.setText("");
                ageField.setText("");
                departmentField.setText("");
            }
        } else if (e.getSource() == btl_cancel) {
            myFrame.dispose();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) {
            String selectedItem = (String) cb.getSelectedItem();
            if ("fe".equals(selectedItem)) {
                System.out.println("fe");
                JOptionPane.showMessageDialog(null, "fe");
            } else if ("se".equals(selectedItem)) {
                System.out.println("se");
                JOptionPane.showMessageDialog(null, "se");
            } else if ("te".equals(selectedItem)) {
                System.out.println("te");
                JOptionPane.showMessageDialog(null, "te");
            }
            System.out.println("ComboBox Selected: " + selectedItem);
        } else if (e.getSource() == cb1) {
            String selectedItem = (String) cb1.getSelectedItem();
            if ("fy".equals(selectedItem)) {
                System.out.println("fy");
                JOptionPane.showMessageDialog(null, "fy");
            } else if ("sy".equals(selectedItem)) {
                System.out.println("sy");
                JOptionPane.showMessageDialog(null, "sy");
            } else if ("ty".equals(selectedItem)) {
                System.out.println("ty");
                JOptionPane.showMessageDialog(null, "ty");
            }
            System.out.println("ComboBox Selected: " + selectedItem);
        }
    }
}
