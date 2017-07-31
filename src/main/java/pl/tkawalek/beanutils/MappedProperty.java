package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.PropertyUtils;
import pl.tkawalek.beanutils.bean.Address;
import pl.tkawalek.beanutils.bean.Person;

import java.lang.reflect.InvocationTargetException;

public class MappedProperty {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        Address home = new Address();
        home.setStreet("Monciak");
        home.setCity("Sopot");

        Address work = new Address();
        work.setStreet("Jana z Kolna");
        work.setCity("Gdańsk");

        PropertyUtils.setMappedProperty(person, "address(home)", home);
        Address home1 = (Address) PropertyUtils.getMappedProperty(person, "address(home)");
        System.out.println(home1.getStreet() + ", " + home1.getCity());

        PropertyUtils.setMappedProperty(person, "address", "work", work);
        Address work1 = (Address) PropertyUtils.getMappedProperty(person, "address", "work");
        System.out.println(work1.getStreet() + ", " + work1.getCity());
    }

}
