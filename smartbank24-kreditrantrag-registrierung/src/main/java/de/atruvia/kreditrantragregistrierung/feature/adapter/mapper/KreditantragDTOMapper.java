package de.atruvia.kreditrantragregistrierung.feature.adapter.mapper;


import de.atruvia.kreditrantragregistrierung.feature.adapter.dto.KreditantragDTO;
import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragDTOMapper {
    KreditantragDTO convert(Kreditantrag kreditantrag);
    Kreditantrag convert(KreditantragDTO kreditantrag);

    Iterable<KreditantragDTO> convert(Iterable<Kreditantrag> antraege);
}
