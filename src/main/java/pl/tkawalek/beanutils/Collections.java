package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.BeanPropertyValueChangeClosure;
import org.apache.commons.collections.CollectionUtils;
import pl.tkawalek.beanutils.bean.Person;

import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(), new Person(), new Person());

        BeanPropertyValueChangeClosure closure = new BeanPropertyValueChangeClosure("firstName", "Marcin");
        CollectionUtils.forAllDo(people, closure);
        System.out.println(people);
    }
}
