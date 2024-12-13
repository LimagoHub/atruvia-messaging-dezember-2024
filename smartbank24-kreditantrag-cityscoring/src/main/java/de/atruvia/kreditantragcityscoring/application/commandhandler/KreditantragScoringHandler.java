package de.atruvia.kreditantragcityscoring.application.commandhandler;

import de.atruvia.kreditantragcityscoring.domain.aggregate.Kreditantrag;

public interface KreditantragScoringHandler {

    void handle(Kreditantrag kreditantrag);
}
