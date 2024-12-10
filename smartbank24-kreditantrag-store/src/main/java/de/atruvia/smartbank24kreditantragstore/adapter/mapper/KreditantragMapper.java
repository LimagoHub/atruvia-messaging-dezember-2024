package de.atruvia.smartbank24kreditantragstore.adapter.mapper;


import de.atruvia.smartbank24kreditantragstore.adapter.repositories.entities.KreditantragEntity;
import de.atruvia.smartbank24kreditantragstore.domain.aggregate.Kreditantrag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragMapper {
    Kreditantrag convert(KreditantragEntity kreditantrag);
    KreditantragEntity convert(Kreditantrag kreditantrag);

    Iterable<Kreditantrag> convert(Iterable<KreditantragEntity> antraege);
}
