import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
class Contact {
    String name, phone, email, address;

    Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    String toFileString() {
        return name + "," + phone + "," + email + "," + address;
    }

    String display() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email + "Address: " + address;
    }
}

public class ContactManager extends Frame implements ActionListener {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static final String FILE_NAME = "contacts.txt";

    TextField nameField, phoneField, emailField, addressField;
    TextArea output;

    Button addBtn, viewBtn, searchBtn, deleteBtn, updateBtn;

    ContactManager() {

        setTitle("Contact Manager");
        setSize(400, 400);
        setLayout(new FlowLayout());

        add(new Label("Name"));
        nameField = new TextField(20);
        add(nameField);

        add(new Label("Phone"));
        phoneField = new TextField(20);
        add(phoneField);

        add(new Label("Email"));
        emailField = new TextField(20);
        add(emailField);

        add(new Label("Address"));
        addressField = new TextField(20);
        add(addressField);

        addBtn = new Button("Add");
        viewBtn = new Button("View");
        searchBtn = new Button("Search");
        deleteBtn = new Button("Delete");
        updateBtn = new Button("Update");

        add(addBtn);
        add(viewBtn);
        add(searchBtn);
        add(deleteBtn);
        add(updateBtn);

        output = new TextArea(10, 40);
        add(output);

        addBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        loadFromFile();
        setVisible(true);
    }

    static void loadFromFile() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (d.length == 3) {
                    contacts.add(new Contact(d[0], d[1], d[2], d[3]));
                }
            }
            br.close();
        } catch (Exception e) {}
    }

    static void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for (Contact c : contacts) {
                bw.write(c.toFileString());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {}
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();
        String address = addressField.getText();

        if (e.getSource() == addBtn) {
            contacts.add(new Contact(name, phone, email, address));
            saveToFile();
            output.setText("Contact Added");
        }

        else if (e.getSource() == viewBtn) {
            String res = "";
            for (Contact c : contacts) {
                res += c.display() + "\n";
            }
            output.setText(res);
        }

        else if (e.getSource() == searchBtn) {
            for (Contact c : contacts) {
                if (c.name.equalsIgnoreCase(name)) {
                    output.setText(c.display());
                    return;
                }
            }
            output.setText("Not Found");
        }

        else if (e.getSource() == deleteBtn) {
            Iterator<Contact> it = contacts.iterator();
            while (it.hasNext()) {
                if (it.next().name.equalsIgnoreCase(name)) {
                    it.remove();
                    saveToFile();
                    output.setText("Deleted");
                    return;
                }
            }
            output.setText("Not Found");
        }

        else if (e.getSource() == updateBtn) {
            for (Contact c : contacts) {
                if (c.name.equalsIgnoreCase(name)) {
                    c.phone = phone;
                    c.email = email;
                    saveToFile();
                    output.setText("Updated");
                    return;
                }
            }
            output.setText("Not Found");
        }
    }
    public static void main(String[] args) {
        new ContactManager();
    }
}