package app.banque.banquedsi.repositories;



import app.banque.banquedsi.entities.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteCourantRepository extends JpaRepository<CompteCourant,String> {
}
