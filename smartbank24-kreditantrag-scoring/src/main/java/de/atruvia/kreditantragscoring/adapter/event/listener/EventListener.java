package de.atruvia.kreditantragscoring.adapter.event.listener;

import de.atruvia.kreditantragscoring.adapter.event.KreditantragEvent;
import de.atruvia.kreditantragscoring.adapter.mapper.KreditantragEventToKreditantrag;
import de.atruvia.kreditantragscoring.application.commandhandler.KreditantragScoringHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventListener {

    @Bean
    public Consumer<KreditantragEvent> kreditantragpersistiert(final KreditantragScoringHandler kreditantragScoringHandler, final KreditantragEventToKreditantrag mapper){
        return kreditantragEvent -> kreditantragScoringHandler.handle(mapper.convert(kreditantragEvent));
    }

}
