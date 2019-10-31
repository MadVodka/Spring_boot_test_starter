package ivan.vatlin.configurations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnWebApplication
public class ContextEventListener {
    @EventListener
    public void processStartEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Hello world from event listener!");
    }
}
