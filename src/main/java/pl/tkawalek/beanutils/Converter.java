package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import pl.tkawalek.beanutils.bean.Address;
import pl.tkawalek.beanutils.bean.Person;
import pl.tkawalek.beanutils.converter.AddressConverter;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Converter {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ConvertUtils.register(new AddressConverter(), Address.class);

        Map<String, Object> map = new HashMap<>();
        map.put("firstName", "Krzysztof");
        map.put("lastName", "Rutkowski");
        map.put("address(home)", "Monciak,Sopot");

        Person person = new Person();
        BeanUtils.populate(person, map);

        System.out.println(person);
    }
}
