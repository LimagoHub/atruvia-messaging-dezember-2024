package de.atruvia.smartbank24kreditrantragregistrierung.application.queryreader;


import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.KreditantragServiceException;

import java.util.Optional;

public interface KreditantragReader {

    public Optional<Kreditantrag> findById(String id)throws KreditantragServiceException;
    public Iterable<Kreditantrag> findAll()throws KreditantragServiceException ;
}
