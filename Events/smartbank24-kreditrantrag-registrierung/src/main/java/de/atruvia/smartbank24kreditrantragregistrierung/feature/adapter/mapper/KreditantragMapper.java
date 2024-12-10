package de.atruvia.smartbank24kreditrantragregistrierung.adapter.mapper;


import de.atruvia.smartbank24kreditrantragregistrierung.adapter.repositories.entities.KreditantragEntity;
import de.atruvia.smartbank24kreditrantragregistrierung.domain.model.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragMapper {
    Kreditantrag convert(KreditantragEntity kreditantrag);
    KreditantragEntity convert(Kreditantrag kreditantrag);

    Iterable<Kreditantrag> convert(Iterable<KreditantragEntity> antraege);
}
