package de.atruvia.kreditrantragregistrierung.feature.adapter.event.emitter;


import de.atruvia.kreditrantragregistrierung.feature.adapter.event.KreditantragRegistriertEvent;
import de.atruvia.kreditrantragregistrierung.feature.adapter.mapper.KreditantragDTOMapper;
import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
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
        var dto = mapper.convert(antrag);
        bridge.send(SUPPLIER_BINDIN_NAME, KreditantragRegistriertEvent.builder().kreditantrag(dto).build());
    }
}
