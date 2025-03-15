package app.banque.banquedsi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;
    private String nomClient;
    private String adresseClient;
    private String emailClient;
    @OneToMany(mappedBy="client")
    private List<Compte> comptes;

}
