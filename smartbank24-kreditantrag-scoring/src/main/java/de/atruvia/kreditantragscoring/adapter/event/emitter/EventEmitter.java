package de.atruvia.kreditantragscoring.adapter.event.emitter;

import de.atruvia.kreditantragscoring.adapter.event.ScoringEvent;
import de.atruvia.kreditantragscoring.adapter.mapper.ScoringLocalEventToScoringEvent;
import de.atruvia.kreditantragscoring.application.events.ScoringNegativeLocalEvent;
import de.atruvia.kreditantragscoring.application.events.ScoringPositiveLocalEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventEmitter {
    private static final String SUPPLIER_BINDING_NAME_SCORING_NEGATIVE = "scoringnegative-out-0";
    private static final String SUPPLIER_BINDING_NAME_SCORING_POSITIVE = "scoringpositive-out-0";

    private final ScoringLocalEventToScoringEvent mapper;
    private final StreamBridge bridge;
    @EventListener
    public void handle(ScoringNegativeLocalEvent localEvent){
        ScoringEvent scoringEvent = mapper.convert(localEvent);
        bridge.send(SUPPLIER_BINDING_NAME_SCORING_NEGATIVE, scoringEvent);
    }

    @EventListener
    public void handle(ScoringPositiveLocalEvent localEvent){
        ScoringEvent scoringEvent = mapper.convert(localEvent);
        bridge.send(SUPPLIER_BINDING_NAME_SCORING_POSITIVE, scoringEvent);
    }
}
