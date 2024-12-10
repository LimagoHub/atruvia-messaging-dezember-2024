package de.atruvia.smartbank24kreditrantragregistrierung.domain.services.internal;


import de.atruvia.smartbank24kreditrantragregistrierung.domain.KreditantragRepository;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.KreditantragService;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.services.KreditantragServiceException;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class KreditantragServiceImpl implements KreditantragService {

    private final KreditantragRepository repo;


    @Override
    public void register(Kreditantrag kreditantrag) throws KreditantragServiceException {
        try {
            if(repo.existenzPruefen(kreditantrag)) {
                throw new KreditantragServiceException("Upps");
            }
            repo.anlegen(kreditantrag);

        } catch (RuntimeException e) {

            throw new  KreditantragServiceException("Upps", e);
        }
    }

    @Override
    public Optional<Kreditantrag> findById(String id) throws KreditantragServiceException {
        try {
            return repo.findeAntragNachId(id);
        } catch (Exception e) {
            throw new  KreditantragServiceException("Upps", e);
        }
    }

    @Override
    public Iterable<Kreditantrag> findAll() throws KreditantragServiceException {
        try {
            return repo.findeAlle();
        } catch (Exception e) {
            throw new  KreditantragServiceException("Upps", e);
        }
    }
}
