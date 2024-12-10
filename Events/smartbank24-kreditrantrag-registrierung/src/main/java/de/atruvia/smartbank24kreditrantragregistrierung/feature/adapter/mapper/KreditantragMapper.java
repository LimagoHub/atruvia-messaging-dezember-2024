package de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.mapper;


import de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.repositories.entities.KreditantragEntity;
import de.atruvia.smartbank24kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragMapper {
    Kreditantrag convert(KreditantragEntity kreditantrag);
    KreditantragEntity convert(Kreditantrag kreditantrag);

    Iterable<Kreditantrag> convert(Iterable<KreditantragEntity> antraege);
}
