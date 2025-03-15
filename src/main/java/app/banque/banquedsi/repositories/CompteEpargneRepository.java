package app.banque.banquedsi.repositories;


import app.banque.banquedsi.entities.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteEpargneRepository extends JpaRepository<CompteEpargne,String> {
}
