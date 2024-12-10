package de.atruvia.smartbank24kreditrantragregistrierung.repositories.impl;


import de.atruvia.smartbank24kreditrantragregistrierung.domain.KreditantragRepository;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import de.atruvia.smartbank24kreditrantragregistrierung.repositories.KreditantragPersistence;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class KreditantragRepositoryImpl implements KreditantragRepository {

    private final KreditantragPersistence persistence;
    private final KreditantragMapper mapper;

    @Override
    public void anlegen(Kreditantrag antrag) {
        persistence.save(mapper.convert(antrag));
    }

    @Override
    public boolean existenzPruefen(Kreditantrag k) {
        return persistence.existsById(k.getCreditApplicationId());
    }

    @Override
    public Optional<Kreditantrag> findeAntragNachId(String id) {
        return persistence.findById(id).map(mapper::convert);
    }

    @Override
    public Iterable<Kreditantrag> findeAlle() {
        return mapper.convert(persistence.findAll());
    }
}
