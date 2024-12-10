package de.atruvia.kreditrantragregistrierung.feature.domain;


import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;

import java.util.Optional;

public interface KreditantragRepository {
    void anlegen(Kreditantrag antrag);

    boolean existenzPruefen(Kreditantrag k);

    Optional<Kreditantrag> findeAntragNachId(String id);

    Iterable<Kreditantrag> findeAlle();
}
