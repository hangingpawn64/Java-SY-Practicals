import java.util.*;
import java.io.*;

// Contact Class
class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String toFileString() {
        return name + "," + phone + "," + email;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("---------------------------");
    }
}

// Main Class
public class ContactManager {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "contacts.txt";

    // LOAD FROM FILE
    static void loadFromFile() {
        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    contacts.add(new Contact(data[0], data[1], data[2]));
                }
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error loading contacts.");
        }
    }

    // SAVE TO FILE
    static void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for (Contact c : contacts) {
                bw.write(c.toFileString());
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error saving contacts.");
        }
    }

    // ADD CONTACT
    static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));
        saveToFile();

        System.out.println("✅ Contact Saved!\n");
    }

    // VIEW CONTACTS
    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }

    // SEARCH CONTACT
    static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                c.display();
                return;
            }
        }

        System.out.println("Contact not found.\n");
    }

    // DELETE CONTACT
    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();

        Iterator<Contact> it = contacts.iterator();

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.name.equalsIgnoreCase(name)) {
                it.remove();
                saveToFile();
                System.out.println("🗑 Contact Deleted!\n");
                return;
            }
        }

        System.out.println("Contact not found.\n");
    }

    // UPDATE CONTACT
    static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new phone: ");
                c.phone = sc.nextLine();

                System.out.print("Enter new email: ");
                c.email = sc.nextLine();

                saveToFile();
                System.out.println("✏ Contact Updated!\n");
                return;
            }
        }

        System.out.println("Contact not found.\n");
    }

    // MAIN
    public static void main(String[] args) {

        loadFromFile(); // 🔥 important

        while (true) {
            System.out.println("===== CONTACT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("6. Exit");

            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addContact(); break;
                case 2: viewContacts(); break;
                case 3: searchContact(); break;
                case 4: deleteContact(); break;
                case 5: updateContact(); break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}
