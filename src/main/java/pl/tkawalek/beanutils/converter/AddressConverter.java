package pl.tkawalek.beanutils.converter;

import org.apache.commons.beanutils.Converter;
import pl.tkawalek.beanutils.bean.Address;

public class AddressConverter implements Converter {

    @Override
    public <T> T convert(Class<T> aClass, Object o) {
        String[] address = ((String) o).split(",");
        Address a = new Address();
        a.setStreet(address[0]);
        a.setCity(address[1]);
        return (T) a;
    }
}
