package Sathish292004;

import Sathish292004.model.Laptop;
import Sathish292004.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
          ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);

//          Alien obj = context.getBean(Alien.class);
//          System.out.println(obj.getAge());
//          obj.code();

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);




    }

}
