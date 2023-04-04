package pl.zajavka.scopedBeanInjectionProblem;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main_ScopeProblem {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        PrototypeBean firstPrototype = firstSingleton.callPrototypeBean().getObject();

        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
        PrototypeBean secondPrototype = secondSingleton.callPrototypeBean().getObject();

        System.out.println("firstPrototype == secondPrototype? " + (firstPrototype == secondPrototype));
    }
}
