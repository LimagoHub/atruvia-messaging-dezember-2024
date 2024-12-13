package de.atruvia.kreditantragscoring.adapter.mapper;

import de.atruvia.kreditantragscoring.adapter.event.KreditantragEvent;
import de.atruvia.kreditantragscoring.domain.aggregate.Kreditantrag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KreditantragEventToKreditantrag {
    @Mapping(source = "kreditantrag", target = ".")
    Kreditantrag convert(KreditantragEvent kreditantragEvent);
}
