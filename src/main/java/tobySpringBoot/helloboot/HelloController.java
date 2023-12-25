package tobySpringBoot.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@Controller
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ResponseBody
    public String hello(@RequestParam(value = "name") String name) {
        // ResponseBody를 붙이지 않거나 RestController를 붙이지 않는다면 반환 값이 String일 때 view를 찾으려고 함.
        // 하지만 View를 만들지 않았으니 404 에러를 발생시킨다.

        return helloService.sayHello(name);
    }

}
