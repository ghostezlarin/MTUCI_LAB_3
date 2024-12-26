public class Main {
    public static void main(String[] args) {
        HashTable<String,String> hashTable = new HashTable<>();
        hashTable.put("1", "Мама");
        hashTable.put("2", "Папа");
        System.out.println("Вывести по ключу: " + hashTable.get("2"));
        System.out.println("Size: " + hashTable.size());
        hashTable.remove("1");
        System.out.println("Is empty: " + hashTable.isEmpty());

        Contacts contacts = new Contacts();

        Contact contact1 = new Contact("Pavel Larin","pavel.larin.2005@mail.ru", "test");
        Contact contact2 = new Contact("Pavlas Protopas", "pavlasprotopas@gmail.com", "test2");
        Contact contact3 = new Contact("TEST", "TEST", "test3");

        contacts.addContact(1,contact1);
        contacts.addContact(2,contact2);
        contacts.addContact(3,contact3);

        contacts.displayContacts();

        contacts.removeContact(1);

        System.out.println("Contac 1 after removal: " + contacts.getContact(1));

        contacts.displayContacts();
        }
}