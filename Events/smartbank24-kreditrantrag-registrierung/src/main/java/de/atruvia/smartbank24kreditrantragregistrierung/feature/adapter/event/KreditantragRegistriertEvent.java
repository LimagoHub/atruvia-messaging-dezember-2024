package de.atruvia.smartbank24kreditrantragregistrierung.adapter.event;


import de.atruvia.smartbank24kreditrantragregistrierung.adapter.dto.KreditantragDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class KreditantragRegistriertEvent extends BaseEvent {
    private KreditantragDTO kreditantrag;
}
