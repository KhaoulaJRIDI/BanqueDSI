package app.banque.banquedsi.repositories;


import app.banque.banquedsi.entities.Versement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VersementRepository extends JpaRepository<Versement,Long> {
}
