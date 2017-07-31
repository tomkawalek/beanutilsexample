package pl.tkawalek.beanutils.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Person {

    private String firstName;
    private String lastName;
    private String[] parentNames;
    private Map<String, Address> addresses;

    public Person() {
        parentNames = new String[2];
        addresses = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getParentNames() {
        return parentNames;
    }

    public void setParentNames(String[] parentNames) {
        this.parentNames = parentNames;
    }

    public Address getAddress(String key) {
        return addresses.get(key);
    }

    public void setAddress(String key, Address address) {
        addresses.put(key, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parentNames=" + Arrays.toString(parentNames) +
                ", addresses=" + addresses +
                '}';
    }
}
