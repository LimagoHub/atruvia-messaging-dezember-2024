package de.atruvia.kreditantragscoring.adapter.mapper;

import de.atruvia.kreditantragscoring.adapter.event.ScoringEvent;
import de.atruvia.kreditantragscoring.application.events.ScoringNegativeLocalEvent;
import de.atruvia.kreditantragscoring.application.events.ScoringPositiveLocalEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScoringLocalEventToScoringEvent {

    ScoringEvent convert(ScoringPositiveLocalEvent positiveLocalEvent);
    ScoringEvent convert(ScoringNegativeLocalEvent positiveLocalEvent);
}
