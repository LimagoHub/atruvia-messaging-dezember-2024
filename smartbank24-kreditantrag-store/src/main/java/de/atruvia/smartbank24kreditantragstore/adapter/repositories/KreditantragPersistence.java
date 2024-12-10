package de.atruvia.smartbank24kreditantragstore.adapter.repositories;


import de.atruvia.smartbank24kreditantragstore.adapter.repositories.entities.KreditantragEntity;
import org.springframework.data.repository.CrudRepository;

public interface KreditantragPersistence extends CrudRepository<KreditantragEntity, String> {
}
