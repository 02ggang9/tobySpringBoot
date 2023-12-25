package tobySpringBoot.helloboot;

import org.springframework.boot.SpringApplication;
import tobySpringBoot.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {


    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
//        MySpringApplication.run(HellobootApplication.class, args);
    }


}
