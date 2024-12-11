package de.atruvia.smartbank24kreditantragscoring.application.handler.internal;


import de.atruvia.smartbank24kreditantragscoring.domain.aggregates.Kreditantrag;
import de.atruvia.smartbank24kreditantragscoring.application.events.KreditantragEvent;
import de.atruvia.smartbank24kreditantragscoring.application.events.service.EventService;
import de.atruvia.smartbank24kreditantragscoring.application.handler.KreditantragHandler;
import de.atruvia.smartbank24kreditantragscoring.application.mapper.KreditantragDTOMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class KreditantragHandlerImpl implements KreditantragHandler {

    private final EventService eventService;
    private final KreditantragDTOMapper mapper;

    @Override
    public void handle(KreditantragEvent kreditantragEvent) {

        Kreditantrag kreditantrag = mapper.convert(kreditantragEvent.getKreditantrag());
        if (kreditantrag.isKreditwuerdig()) {
            eventService.publishScoringPositivEvent(kreditantrag);
        } else {
            eventService.publishScoringNegativEvent(kreditantrag);
        }
    }
}
