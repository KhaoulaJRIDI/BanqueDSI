package app.banque.banquedsi.repositories;


import app.banque.banquedsi.entities.Client;
import app.banque.banquedsi.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;


public interface ClientRepository extends JpaRepository<Client,Long> {

    public Collection<Client> findByNomClient(@Param("name") String name);
    public Client findByEmailClient(@Param("email") String email);
    public Client findByAdresseClient(@Param("adresse") String adresse);


}
