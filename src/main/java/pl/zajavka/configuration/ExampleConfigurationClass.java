package pl.zajavka.configuration;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.zajavka.Main;
import pl.zajavka.scopedBeanInjectionProblem.PrototypeBean;
import pl.zajavka.scopedBeanInjectionProblem.SingletonBean;

@Configuration
//@ComponentScan(basePackages = "pl.zajavka.code")
//@ComponentScan(basePackageClasses = BeanInterface.class)
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

    @Bean
    public SingletonBean singletonBean(ObjectFactory<PrototypeBean> prototypeBean) {
        return new SingletonBean(prototypeBean);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

}
