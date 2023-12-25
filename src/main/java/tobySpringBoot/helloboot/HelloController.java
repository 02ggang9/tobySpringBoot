package tobySpringBoot.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/*
 * HTML을 통채로 리턴하는 대신에 응답을 특정한 타입으로 인코딩해서 보내는 방식
 * */
//@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    //    @GetMapping("/hello")
    public String hello(String name) {

        return helloService.sayHello(Objects.requireNonNull(name));
    }

}
