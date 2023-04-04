package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ExamplePrototypeBean {

    private InjectedBean injectedBean;

    @Autowired
    public ExamplePrototypeBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void exampleMethod() {
        injectedBean.injectedBeanMethod();
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
