package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.PropertyUtils;
import pl.tkawalek.beanutils.bean.Person;

import java.lang.reflect.InvocationTargetException;

public class SimpleProperty {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        person.setFirstName("Krzysztof");
        person.setLastName("Rutkowski");

        String firstName = (String) PropertyUtils.getSimpleProperty(person, "firstName");
        System.out.println("firstName: " + firstName);

        PropertyUtils.setSimpleProperty(person, "firstName", "Marcin");
        firstName = (String) PropertyUtils.getSimpleProperty(person, "firstName");
        System.out.println("firstName: " + firstName);
    }
}
