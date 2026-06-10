package Sathish292004.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Primary
    public void compile(){
        System.out.println("Desktop compile");
    }
}
