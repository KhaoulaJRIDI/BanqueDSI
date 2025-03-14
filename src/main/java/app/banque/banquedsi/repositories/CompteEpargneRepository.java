package app.banque.repositories;

import app.banque.entities.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteEpargneRepository extends JpaRepository<CompteEpargne,String> {
}
