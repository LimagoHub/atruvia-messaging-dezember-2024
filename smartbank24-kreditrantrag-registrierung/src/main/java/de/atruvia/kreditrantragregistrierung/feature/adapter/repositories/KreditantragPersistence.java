package de.atruvia.kreditrantragregistrierung.feature.adapter.repositories;


import de.atruvia.kreditrantragregistrierung.feature.adapter.repositories.entities.KreditantragEntity;
import org.springframework.data.repository.CrudRepository;

public interface KreditantragPersistence extends CrudRepository<KreditantragEntity, String> {
}
