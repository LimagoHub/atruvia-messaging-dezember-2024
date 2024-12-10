package de.atruvia.kreditrantragregistrierung.feature.adapter.mapper;


import de.atruvia.kreditrantragregistrierung.feature.adapter.repositories.entities.KreditantragEntity;
import de.atruvia.kreditrantragregistrierung.feature.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragMapper {
    Kreditantrag convert(KreditantragEntity kreditantrag);
    KreditantragEntity convert(Kreditantrag kreditantrag);

    Iterable<Kreditantrag> convert(Iterable<KreditantragEntity> antraege);
}
