package Sathish292004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);

//        Alien obj = context.getBean(Alien.class);
//        obj.code();

        Alien lap = context.getBean(Alien.class);
        lap.code();
    }

}
