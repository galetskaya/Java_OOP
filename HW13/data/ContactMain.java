package HW13.data;

import java.util.HashMap;
import java.util.Map;

public class ContactMain {

    protected String name;
    protected Map<String, String> communicationMethods;
    protected String address;

    public ContactMain(String name, String address, String key, String value) {
        this.name = name;
        this.address = address;
        this.communicationMethods = new HashMap<>();
        communicationMethods.put(key, value);

    }


    public Map<String, String> getCommunicationMethods() {
        return communicationMethods;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact [" +
                "Name: " + name + ", " +
                "Address: " + address + ", " +
                communicationMethods +
                "] \n";
    }

    public String getName() {
        return name;
    }
}
