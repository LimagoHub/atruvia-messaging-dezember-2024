package de.atruvia.kreditrantragregistrierung.feature.application.queryreader;


import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;

import java.util.Optional;

public interface KreditantragReader {

    public Optional<Kreditantrag> findById(String id)throws KreditantragServiceException;
    public Iterable<Kreditantrag> findAll()throws KreditantragServiceException ;
}
