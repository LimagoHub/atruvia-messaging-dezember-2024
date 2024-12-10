package de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.repositories;


import de.atruvia.smartbank24kreditrantragregistrierung.feature.adapter.repositories.entities.KreditantragEntity;
import org.springframework.data.repository.CrudRepository;

public interface KreditantragPersistence extends CrudRepository<KreditantragEntity, String> {
}
