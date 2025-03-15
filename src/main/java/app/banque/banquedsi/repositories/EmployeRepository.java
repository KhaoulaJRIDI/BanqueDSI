package app.banque.banquedsi.repositories;



import app.banque.banquedsi.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
