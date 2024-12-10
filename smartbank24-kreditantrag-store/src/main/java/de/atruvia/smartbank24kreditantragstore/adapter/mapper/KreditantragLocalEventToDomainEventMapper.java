package de.atruvia.smartbank24kreditantragstore.adapter.mapper;


import de.atruvia.smartbank24kreditantragstore.adapter.event.KreditantragEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.KreditAntragAcceptedLocalEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.KreditantragDeniedLocalEvent;
import de.atruvia.smartbank24kreditantragstore.domain.event.KreditantragPersistiertLocalEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KreditantragLocalEventToDomainEventMapper {

    KreditantragEvent convert(KreditantragPersistiertLocalEvent kreditantragPersistiertLocalEvent);
    KreditantragEvent convert(KreditAntragAcceptedLocalEvent kreditAntragAcceptedLocalEvent);
    KreditantragEvent convert(KreditantragDeniedLocalEvent kreditantragDeniedLocalEvent);
}
