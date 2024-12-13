package de.atruvia.kreditantragscoring.application.commandhandler;

import de.atruvia.kreditantragscoring.domain.aggregate.Kreditantrag;

public interface KreditantragScoringHandler {

    void handle(Kreditantrag kreditantrag);
}
