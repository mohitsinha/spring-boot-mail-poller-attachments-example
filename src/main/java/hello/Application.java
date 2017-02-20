package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/hello/integration.xml")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        System.out.println("Hit Enter to terminate");
        System.in.read();
    }
}
