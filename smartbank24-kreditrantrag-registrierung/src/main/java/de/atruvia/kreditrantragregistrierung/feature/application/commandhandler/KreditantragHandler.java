package de.atruvia.kreditrantragregistrierung.feature.application.commandhandler;


import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;

public interface KreditantragHandler {
    void handle(Kreditantrag kreditantrag) throws KreditantragServiceException;
}
