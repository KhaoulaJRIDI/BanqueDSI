package app.banque.repositories;

import app.banque.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ClientRepository extends JpaRepository<Client,Long> {

    public Client findByNomClient(@Param("name") String name);
    public Client findByEmailClient(@Param("email") String email);
    public Client findByAdresseClient(@Param("adresse") String adresse);
}
