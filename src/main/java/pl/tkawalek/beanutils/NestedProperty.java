package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.PropertyUtils;
import pl.tkawalek.beanutils.bean.Address;
import pl.tkawalek.beanutils.bean.Person;

import java.lang.reflect.InvocationTargetException;

public class NestedProperty {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        Address home = new Address();
        home.setStreet("Monciak");
        home.setCity("Sopot");
        person.setAddress("home", home);

        String city = (String) PropertyUtils.getNestedProperty(person, "address(home).city");
        System.out.println(city);

        PropertyUtils.setNestedProperty(person, "address(home).city", "Radom");
        System.out.println(person.getAddress("home").getCity());
    }
}
