package de.atruvia.kreditantragcityscoring.adapter.mapper;

import de.atruvia.kreditantragcityscoring.adapter.event.KreditantragEvent;
import de.atruvia.kreditantragcityscoring.domain.aggregate.Kreditantrag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KreditantragEventToKreditantrag {
    @Mapping(source = "kreditantrag", target = ".")
    Kreditantrag convert(KreditantragEvent kreditantragEvent);
}
