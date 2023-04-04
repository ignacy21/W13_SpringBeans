package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;

    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    @Autowired
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling ExampleBean(...)");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod(): " + injectedBean + ", " + anotherInjectedBean);
    }
}
