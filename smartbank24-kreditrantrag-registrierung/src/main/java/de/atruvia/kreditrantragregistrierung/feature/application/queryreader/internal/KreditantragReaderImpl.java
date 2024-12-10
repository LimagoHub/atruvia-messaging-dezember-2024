package de.atruvia.kreditrantragregistrierung.feature.application.queryreader.internal;


import de.atruvia.kreditrantragregistrierung.feature.application.queryreader.KreditantragReader;
import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragService;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KreditantragReaderImpl implements KreditantragReader {

    private final KreditantragService service;

    @Override
    public Optional<Kreditantrag> findById(String id) throws KreditantragServiceException {
        return service.findById(id);
    }

    @Override
    public Iterable<Kreditantrag> findAll() throws KreditantragServiceException {
        return service.findAll();
    }
}
