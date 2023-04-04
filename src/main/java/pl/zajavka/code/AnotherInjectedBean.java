package pl.zajavka.code;


import org.springframework.stereotype.Component;

@Component
public class AnotherInjectedBean {

    public AnotherInjectedBean() {
        System.out.println("Calling AnotherInjectedBeam()");
    }
}
