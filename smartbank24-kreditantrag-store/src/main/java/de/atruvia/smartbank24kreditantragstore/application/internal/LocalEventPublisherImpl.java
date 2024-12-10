package de.atruvia.smartbank24kreditantragstore.application.internal;


import de.atruvia.smartbank24kreditantragstore.domain.event.KreditAntragAcceptedLocalEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.KreditantragDeniedLocalEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.KreditantragPersistiertLocalEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.LocalEventPublisher;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocalEventPublisherImpl implements LocalEventPublisher {

    private final ApplicationEventPublisher publisher;

    @Override
    public void sende(KreditantragPersistiertLocalEvent event) {
        publisher.publishEvent(event);
    }

    @Override
    public void sende(KreditAntragAcceptedLocalEvent event) {
        publisher.publishEvent(event);
    }

    @Override
    public void sende(KreditantragDeniedLocalEvent event) {
        publisher.publishEvent(event);
    }
}
