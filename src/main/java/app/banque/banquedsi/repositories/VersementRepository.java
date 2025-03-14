package app.banque.repositories;

import app.banque.entities.Versement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VersementRepository extends JpaRepository<Versement,Long> {
}
