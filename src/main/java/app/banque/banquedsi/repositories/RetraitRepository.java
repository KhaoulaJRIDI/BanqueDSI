package app.banque.repositories;

import app.banque.entities.Retrait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RetraitRepository extends JpaRepository<Retrait,Long> {
}
