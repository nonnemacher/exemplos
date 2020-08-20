package dev.thehouseof.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

import java.time.LocalTime;

import static java.time.format.DateTimeFormatter.ISO_TIME;

public class MainVerticle extends AbstractVerticle {

    private static final long startTime = System.nanoTime();

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        final Router router = Router.router(vertx);
        router.get("/hello")
            .handler(req -> req.response()
                .putHeader("content-type", "text/plain")
                .end("Vert.x, very cool"));


        vertx.createHttpServer()
            .requestHandler(router)
            .listen(8080, http -> {
                if (http.succeeded()) {
                    startPromise.complete();
                    System.out.println("Started in " + LocalTime
                        .ofNanoOfDay(System.nanoTime() - startTime)
                        .format(ISO_TIME) + " seconds");
                } else {
                    startPromise.fail(http.cause());
                }
            });
    }

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new MainVerticle());
    }
}
