package pl.tkawalek.beanutils;

import org.apache.commons.beanutils.*;

import java.util.Map;

public class DynaBeanExample {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        DynaProperty[] properties = new DynaProperty[]{
                new DynaProperty("firstName", String.class),
                new DynaProperty("lastName", String.class),
                new DynaProperty("address", Map.class)
        };

        DynaClass dynaClass = new BasicDynaClass("person", null, properties);

        DynaBean person = dynaClass.newInstance();
        person.set("firstName", "Krzysztof");
        person.set("lastName", "Rutkowski");
    }
}
