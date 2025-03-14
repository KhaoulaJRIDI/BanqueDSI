package app.banque.repositories;


import app.banque.entities.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteCourantRepository extends JpaRepository<CompteCourant,String> {
}
