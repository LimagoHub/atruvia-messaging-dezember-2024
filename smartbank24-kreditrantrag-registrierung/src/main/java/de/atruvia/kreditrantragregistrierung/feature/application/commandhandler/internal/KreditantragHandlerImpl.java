package de.atruvia.kreditrantragregistrierung.feature.application.commandhandler.internal;


import de.atruvia.kreditrantragregistrierung.feature.application.commandhandler.KreditantragHandler;
import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragService;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = KreditantragServiceException.class, propagation = Propagation.REQUIRED)
@AllArgsConstructor
@Slf4j
public class KreditantragHandlerImpl implements KreditantragHandler {



    private final KreditantragService service;
    private final ApplicationEventPublisher publisher;


    @Override
    public void handle(Kreditantrag kreditantrag) throws KreditantragServiceException {
        try {

            service.register(kreditantrag);
            publisher.publishEvent(kreditantrag);
            log.info("Kreditantrag mit der ID '{}' erfolgreich registriert.", kreditantrag.getCreditApplicationId());
        } catch (KreditantragServiceException e) {
            // Misserfolg feuern
            log.error("Fehler beim Registrieren des Kreditantrags mit der ID '{}'", kreditantrag.getCreditApplicationId(), e);
            throw e;
        }
    }


}
