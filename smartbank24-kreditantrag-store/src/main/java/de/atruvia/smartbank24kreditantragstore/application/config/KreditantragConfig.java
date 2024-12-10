package de.atruvia.smartbank24kreditantragstore.application.config;


import de.atruvia.smartbank24kreditantragstore.domain.event.LocalEventPublisher;
import de.atruvia.smartbank24kreditantragstore.domain.service.KreditantragRepository;
import de.atruvia.smartbank24kreditantragstore.domain.service.KreditantragService;
import de.atruvia.smartbank24kreditantragstore.domain.service.internal.KreditantragServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KreditantragConfig {

    @Bean
    public KreditantragService createKreditantragService(KreditantragRepository repo, LocalEventPublisher publisher) {
        return new KreditantragServiceImpl(repo, publisher);
    }
}
