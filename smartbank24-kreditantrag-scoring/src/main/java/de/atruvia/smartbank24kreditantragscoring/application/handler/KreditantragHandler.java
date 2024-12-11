package de.atruvia.smartbank24kreditantragscoring.application.handler;

import de.atruvia.smartbank24kreditantragscoring.application.events.KreditantragEvent;

public interface KreditantragHandler {

    void handle(KreditantragEvent event);
}
