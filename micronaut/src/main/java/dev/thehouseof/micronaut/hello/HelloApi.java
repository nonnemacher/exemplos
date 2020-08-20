package dev.thehouseof.micronaut.hello;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import static io.micronaut.http.MediaType.TEXT_PLAIN;

/**
 * @autor carlos.nonnemacher@thehouseof.dev
 */
@Controller("/hello")
public class HelloApi {

    @Get(produces = TEXT_PLAIN)
    public String sayHello() {
        return "Micronaut, very cool";
    }
}
