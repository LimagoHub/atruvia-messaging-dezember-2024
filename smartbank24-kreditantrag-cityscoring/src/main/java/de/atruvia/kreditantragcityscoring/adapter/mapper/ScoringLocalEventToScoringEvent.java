package de.atruvia.kreditantragcityscoring.adapter.mapper;

import de.atruvia.kreditantragcityscoring.adapter.event.ScoringEvent;
import de.atruvia.kreditantragcityscoring.application.events.ScoringNegativeLocalEvent;
import de.atruvia.kreditantragcityscoring.application.events.ScoringPositiveLocalEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScoringLocalEventToScoringEvent {

    ScoringEvent convert(ScoringPositiveLocalEvent positiveLocalEvent);
    ScoringEvent convert(ScoringNegativeLocalEvent positiveLocalEvent);
}
