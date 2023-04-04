package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SuperBeanClass {

    private final BeanInterface beanInterface;

    public SuperBeanClass(BeanInterface bean1) {
        this.beanInterface = bean1;
    }
}
