package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.code.*;
import pl.zajavka.configuration.ExampleConfigurationClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        ExampleSingletonBean singletonBean1 = context.getBean(ExampleSingletonBean.class);
        ExampleSingletonBean singletonBean2 = context.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean prototypeBean1 = context.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean prototypeBean2 = context.getBean(ExamplePrototypeBean.class);


        System.out.println("singletonBean1 == singletonBean2? " + (singletonBean1 == singletonBean2));
        System.out.println("prototypeBean1 == prototypeBean2? " + (prototypeBean1 == prototypeBean2));

        InjectedBean injectedBean = context.getBean(InjectedBean.class);
        boolean isInjectedBeanASingleton =
                injectedBean == singletonBean1.getInjectedBean()
                        && injectedBean == singletonBean2.getInjectedBean()
                        && injectedBean == prototypeBean1.getInjectedBean()
                        && injectedBean == prototypeBean2.getInjectedBean();
        System.out.println("isInjectedBeanASingleton? " + isInjectedBeanASingleton);

//        System.out.println();
//        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);


    }

}
