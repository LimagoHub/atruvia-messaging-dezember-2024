package de.atruvia.smartbank24kreditrantragregistrierung.application.config;


import de.atruvia.smartbank24kreditrantragregistrierung.domain.KreditantragRepository;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.KreditantragService;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.internal.KreditantragServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KreditantragConfig {

    @Bean
    public KreditantragService createKreditantragService(KreditantragRepository repo) {
        return new KreditantragServiceImpl(repo);
    }
}
