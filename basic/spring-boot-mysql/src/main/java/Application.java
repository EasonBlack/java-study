package com.eason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.eason.Store;
import com.eason.StoreRepository;

@SpringBootApplication
@RestController
public class Application {

    @Autowired 
    private StoreRepository storeRepository;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/all")
	public @ResponseBody Iterable<Store> getAllStores() {
		return storeRepository.findAll();
	}

    @RequestMapping("/1")
    public String route1() {
        return "1111xxxxx11111!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}