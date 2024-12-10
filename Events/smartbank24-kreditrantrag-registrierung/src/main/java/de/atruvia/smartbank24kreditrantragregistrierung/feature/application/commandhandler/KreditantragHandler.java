package de.atruvia.smartbank24kreditrantragregistrierung.application.commandhandler;


import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.KreditantragServiceException;

public interface KreditantragHandler {
    void handle(Kreditantrag kreditantrag) throws KreditantragServiceException;
}
