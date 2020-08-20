package dev.thehouseof.springboot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@RestController
@RequestMapping("/hello")
public class HelloApi {

    @GetMapping(produces = TEXT_PLAIN_VALUE)
    public Mono<String> sayHello() {
        return Mono.just("Spring Boot, very cool");
    }
}
