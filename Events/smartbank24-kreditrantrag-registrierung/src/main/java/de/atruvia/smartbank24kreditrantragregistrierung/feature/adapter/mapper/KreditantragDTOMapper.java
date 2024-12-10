package de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.mapper;


import de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.dto.KreditantragDTO;
import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragDTOMapper {
    KreditantragDTO convert(Kreditantrag kreditantrag);
    Kreditantrag convert(KreditantragDTO kreditantrag);

    Iterable<KreditantragDTO> convert(Iterable<Kreditantrag> antraege);
}
