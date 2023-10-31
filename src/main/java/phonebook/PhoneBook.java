package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        for (String phoneNumber : phoneNumbers) {
            phoneBook.get(name).add(phoneNumber);
        }
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public boolean hasEntry(String name) {
        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String getAllContactNames() {
        StringBuilder names = new StringBuilder();
        for (String name : phoneBook.keySet()) {
            names.append(name).append("\n");
        }
        return names.toString();
    }

}

