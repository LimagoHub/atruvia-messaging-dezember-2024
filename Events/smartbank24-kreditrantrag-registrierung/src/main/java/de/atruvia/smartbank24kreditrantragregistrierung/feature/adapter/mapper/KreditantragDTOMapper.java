package de.atruvia.smartbank24kreditrantragregistrierung.adapter.mapper;


import de.atruvia.smartbank24kreditrantragregistrierung.adapter.dto.KreditantragDTO;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragDTOMapper {
    KreditantragDTO convert(Kreditantrag kreditantrag);
    Kreditantrag convert(KreditantragDTO kreditantrag);

    Iterable<KreditantragDTO> convert(Iterable<Kreditantrag> antraege);
}
