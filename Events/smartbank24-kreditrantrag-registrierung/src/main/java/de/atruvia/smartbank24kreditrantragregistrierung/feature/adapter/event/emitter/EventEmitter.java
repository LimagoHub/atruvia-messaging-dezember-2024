package de.atruvia.smartbank24kreditrantragregistrierung.adapter.event.emitter;


import de.atruvia.smartbank24kreditrantragregistrierung.adapter.mapper.KreditantragDTOMapper;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventEmitter {

    private static final String SUPPLIER_BINDIN_NAME = "kreditantrag-registriert-out-0";
    private final StreamBridge bridge;
    private final KreditantragDTOMapper mapper;

    @EventListener
    public void handle(Kreditantrag antrag){
        bridge.send(SUPPLIER_BINDIN_NAME,mapper.convert(antrag));
    }
}
