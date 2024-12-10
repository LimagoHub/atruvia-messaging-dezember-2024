package de.atruvia.smartbank24kreditrantragregistrierung.feature.application.config;


import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.KreditantragRepository;
import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.services.KreditantragService;
import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.services.internal.KreditantragServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KreditantragConfig {

    @Bean
    public KreditantragService createKreditantragService(KreditantragRepository repo) {
        return new KreditantragServiceImpl(repo);
    }
}
