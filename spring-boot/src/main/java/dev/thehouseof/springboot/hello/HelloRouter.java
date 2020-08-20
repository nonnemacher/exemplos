package dev.thehouseof.springboot.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@Configuration
public class HelloRouter {

    @Bean
    RouterFunction<ServerResponse> sayHello() {
        return route(GET("/function-hello"), request -> ok()
            .bodyValue("Spring Boot, very cool"));
    }
}
