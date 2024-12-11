package de.atruvia.smartbank24kreditantragscoring.application.mapper;

import de.atruvia.smartbank24kreditantragscoring.application.KreditantragDTO;
import de.atruvia.smartbank24kreditantragscoring.domain.aggregates.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragDTOMapper {

    Kreditantrag convert(KreditantragDTO kreditantragDTO);
}
