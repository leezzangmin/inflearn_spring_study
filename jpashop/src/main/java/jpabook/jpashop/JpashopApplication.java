package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
		Hello h = new Hello();
		h.setData("asdf");
		h.getData();

        SpringApplication.run(JpashopApplication.class, args);
    }

}