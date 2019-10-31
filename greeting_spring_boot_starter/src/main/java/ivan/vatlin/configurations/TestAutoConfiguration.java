package ivan.vatlin.configurations;

import ivan.vatlin.entity.Greeter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
public class TestAutoConfiguration {
    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
