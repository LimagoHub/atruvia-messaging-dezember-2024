package de.atruvia.smartbank24kreditantragstore.application.commandhandler.internal;


import de.atruvia.smartbank24kreditantragstore.application.commandhandler.KreditantragHandler;
import de.atruvia.smartbank24kreditantragstore.domain.aggregate.Kreditantrag;
import de.atruvia.smartbank24kreditantragstore.domain.service.KreditantragService;
import de.atruvia.smartbank24kreditantragstore.domain.service.KreditantragServiceException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Service
@Transactional(rollbackFor = KreditantragServiceException.class, propagation = Propagation.REQUIRED)
@AllArgsConstructor
@Slf4j
public class KreditantragHandlerImpl implements KreditantragHandler {



    private final KreditantragService service;

    @Override
    public void handleKreditantragRegistriert(Kreditantrag kreditantrag){
        try {
            service.speichereKreditantrag(kreditantrag);
        } catch (KreditantragServiceException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void handleScoringPositiv(String id){
        try {
            service.verarbeitePositivesScoring(id);
        } catch (KreditantragServiceException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void handleScoringNegativ(String id){
        try {
            service.verarbeiteNegativesScoring(id);
        } catch (KreditantragServiceException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void handleCityScoringPositiv(String id){
        try {
            service.verarbeitePositivesCityScoring(id);
        } catch (KreditantragServiceException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void handleCityScoringNegativ(String id){
        try {
            service.verarbeiteNegativesCityScoring(id);
        } catch (KreditantragServiceException e) {
            throw new RuntimeException(e);
        }
    }
}
