package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Autowired
    @Qualifier("beanOne")
    private static Bean beanOne;
    public static void main(String[] args) {
        beanOne.test();
    }
}
