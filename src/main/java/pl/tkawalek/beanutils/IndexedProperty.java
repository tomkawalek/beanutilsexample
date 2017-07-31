package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.PropertyUtils;
import pl.tkawalek.beanutils.bean.Person;

import java.lang.reflect.InvocationTargetException;

public class IndexedProperty {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();

        PropertyUtils.setIndexedProperty(person, "parentNames[0]", "Janusz");
        String parent = (String) PropertyUtils.getIndexedProperty(person, "parentNames[0]");
        System.out.println(parent);

        PropertyUtils.setIndexedProperty(person, "parentNames", 1, "Grażyna");
        parent = (String) PropertyUtils.getIndexedProperty(person, "parentNames", 1);
        System.out.println(parent);
    }
}
