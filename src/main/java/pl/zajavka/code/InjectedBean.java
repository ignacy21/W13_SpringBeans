package pl.zajavka.code;


import org.springframework.stereotype.Service;

@Service
public class InjectedBean {

    public InjectedBean() {
        System.out.println("Calling InjectedBeam()");
    }

    public void injectedBeanMethod() {
        System.out.println("Calling injectedBeanMethod()");
    }
}
