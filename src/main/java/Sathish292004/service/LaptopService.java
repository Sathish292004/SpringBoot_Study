package Sathish292004.service;

import Sathish292004.LaptopRepo;
import Sathish292004.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;
    public void addLaptop(Laptop lap) {
        //System.out.println("Laptop Method added");
        repo.save(lap);
    }


    public boolean isGood(Laptop lap) {
        return true;
    }
}