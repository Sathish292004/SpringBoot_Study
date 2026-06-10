package Sathish292004;

import Sathish292004.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop lap){

        System.out.println("Save in database...");


    }
}
