package ui;

import javax.swing.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textField2;
    private JLabel textPhone;
    private JButton buttonSave;
    private JButton buttonCancel;

    public ContactForm() {

        setContentPane(rootPanel);
        setSize(500, 300);
        setVisible(true);

    }

}
