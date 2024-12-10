package de.atruvia.smartbank24kreditantragstore.domain.event;


import de.atruvia.smartbank24kreditantragstore.domain.aggregate.Kreditantrag;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KreditantragPersistiertLocalEvent {

    private Kreditantrag kreditantrag;
}
