import java.util.HashMap;

public class Contacts{
    private HashMap<Integer, Contact> contacts;

    public Contacts(){
        contacts = new HashMap<>();
    }

    public void addContact(int contactNumber, Contact contact){
        contacts.put(contactNumber,contact);
        System.out.println("Contact " + contactNumber + " added");
    }

    public Contact getContact(int contactNumber){
        return contacts.get(contactNumber);
    }

    public void removeContact(int contactNumber){
        if (contacts.containsKey(contactNumber)){
            contacts.remove(contactNumber);
            System.out.println("Contact " + contactNumber + " removed");
        }
        else {
            System.out.println("Order " + contactNumber + " not found.");
        }
    }

    public void displayContacts(){
        if (contacts.isEmpty()){
            System.out.println("Contacts not avialiable");
        }
        else {
            for (Integer contactNumber : contacts.keySet()){
                System.out.println("Contact number: " + contactNumber + ", Details" + contacts.get(contactNumber));
            }
        }
    }
}
