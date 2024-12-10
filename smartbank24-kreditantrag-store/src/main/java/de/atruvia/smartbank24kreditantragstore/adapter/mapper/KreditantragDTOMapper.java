package de.atruvia.smartbank24kreditantragstore.adapter.mapper;


import de.atruvia.smartbank24kreditantragstore.adapter.dto.KreditantragDTO;
import de.atruvia.smartbank24kreditantragstore.domain.aggregate.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragDTOMapper {
    KreditantragDTO convert(Kreditantrag kreditantrag);
    Kreditantrag convert(KreditantragDTO kreditantrag);

    Iterable<KreditantragDTO> convert(Iterable<Kreditantrag> antraege);
}
