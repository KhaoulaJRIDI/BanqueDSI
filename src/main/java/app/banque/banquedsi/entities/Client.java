package app.banque.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codeClient;
    private String nomClient;
    private String adresseClient;
    private String emailClient;
    @OneToMany(mappedBy="client")
    private List<Compte> comptes;

}
