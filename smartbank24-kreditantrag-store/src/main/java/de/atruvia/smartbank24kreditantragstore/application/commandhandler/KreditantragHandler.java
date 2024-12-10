package de.atruvia.smartbank24kreditantragstore.application.commandhandler;


import de.atruvia.smartbank24kreditantragstore.domain.aggregate.Kreditantrag;

public interface KreditantragHandler {
    void handleKreditantragRegistriert(Kreditantrag kreditantrag);
    void handleScoringPositiv(String id);
    void handleScoringNegativ(String id);
    void handleCityScoringPositiv(String id);
    void handleCityScoringNegativ(String id);
}
