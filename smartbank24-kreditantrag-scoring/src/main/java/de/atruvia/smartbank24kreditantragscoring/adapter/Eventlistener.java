package de.atruvia.smartbank24kreditantragscoring.adapter;


import de.atruvia.smartbank24kreditantragscoring.application.events.KreditantragEvent;
import de.atruvia.smartbank24kreditantragscoring.application.handler.KreditantragHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class Eventlistener {

    @Bean
    public Consumer<KreditantragEvent> kreditantragPersistiert (KreditantragHandler handler) {
        return handler::handle;
    }
}
