import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing {
    public static void main(String[] args) {
        //Frame
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //Label
        JLabel label = new JLabel("Event Name: ");
        //Text Field
        JTextField textField = new JTextField(15);
        //Text Area
        JTextArea textArea = new JTextArea(5,20);
        //Button
        JButton button = new JButton("Submit");
        //Checkbox
        JCheckBox checkBox = new JCheckBox("Accept Terms");

        JRadioButton r1 = new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        //Combobox
        String[] Countries = {"India","USA","UK"};
        JComboBox<String> comboBox = new JComboBox<>(Countries);
        //List
        String[] items = {"Java", "Python", "C++"};
        JList<String> list = new JList<>(items);
        //Scroll Pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        //Button Action
        button.addActionListener(e -> {
            String name = textField.getText();
            String gender = r1.isSelected() ? "male" :
                            r2.isSelected() ? "female" :
                            "Not Selected";
            String country = (String)comboBox.getSelectedItem();
            String selectLang = list.getSelectedValue();
        JOptionPane.showMessageDialog(frame, "Name: "+name + "\nGender: "+ gender + 
                                    "\nCountry: "+country + "\nLanguage: " + selectLang +
                                    "\nAccepted: " + checkBox.isSelected());
        });
        //Exit Action
        exitItem.addActionListener(e -> System.exit(0));
        //Add Components
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkBox);
        frame.add(r1);
        frame.add(r2);
        frame.add(comboBox);
        frame.add(new JLabel("Select Language"));
        frame.add(list);
        frame.add(scrollPane);
        //Show Frame
        frame.setVisible(true);
    }
}
