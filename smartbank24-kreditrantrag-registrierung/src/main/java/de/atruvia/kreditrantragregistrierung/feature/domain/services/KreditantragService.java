package de.atruvia.kreditrantragregistrierung.feature.domain.services;


import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;

import java.util.Optional;

public interface KreditantragService {

    public void register(Kreditantrag kreditantrag) throws KreditantragServiceException ;
    public Optional<Kreditantrag> findById(String id)throws KreditantragServiceException ;
    public Iterable<Kreditantrag> findAll()throws KreditantragServiceException ;
}
