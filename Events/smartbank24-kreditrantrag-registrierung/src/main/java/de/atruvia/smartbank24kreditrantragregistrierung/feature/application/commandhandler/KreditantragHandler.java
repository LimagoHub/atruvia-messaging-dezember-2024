package de.atruvia.smartbank24kreditrantragregistrierung.feature.application.commandhandler;


import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;

public interface KreditantragHandler {
    void handle(Kreditantrag kreditantrag) throws KreditantragServiceException;
}
