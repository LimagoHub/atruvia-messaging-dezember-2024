package de.atruvia.kreditantragcityscoring.application.commandhandler.internal;

import de.atruvia.kreditantragcityscoring.application.commandhandler.KreditantragScoringHandler;
import de.atruvia.kreditantragcityscoring.application.events.ScoringNegativeLocalEvent;
import de.atruvia.kreditantragcityscoring.application.events.ScoringPositiveLocalEvent;
import de.atruvia.kreditantragcityscoring.domain.aggregate.Kreditantrag;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KreditantragScoringHandlerImpl implements KreditantragScoringHandler {
    private final ApplicationEventPublisher publisher;

    @Override
    public void handle(Kreditantrag kreditantrag) {
        boolean isScoringPositiv = kreditantrag.determineScoring();
        if (isScoringPositiv){
            ScoringPositiveLocalEvent positiveEvent = ScoringPositiveLocalEvent.builder().creditApplicationId(kreditantrag.getCreditApplicationId()).build();
            publisher.publishEvent(positiveEvent);
        } else {
            ScoringNegativeLocalEvent negativeScoring = ScoringNegativeLocalEvent.builder().creditApplicationId(kreditantrag.getCreditApplicationId()).build();
            publisher.publishEvent(negativeScoring);
        }
    }
}
