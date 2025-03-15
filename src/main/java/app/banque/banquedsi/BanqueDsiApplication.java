package app.banque.banquedsi;

import app.banque.banquedsi.entities.Client;
import app.banque.banquedsi.entities.Compte;
import app.banque.banquedsi.entities.CompteCourant;
import app.banque.banquedsi.entities.CompteEpargne;
import app.banque.banquedsi.repositories.ClientRepository;
import app.banque.banquedsi.repositories.CompteCourantRepository;
import app.banque.banquedsi.repositories.CompteEpargneRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BanqueDsiApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CompteCourantRepository compteCourantRepository;
    @Autowired
    CompteEpargneRepository compteEpargneRepository;


    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            Client client = new Client();

            // client.setCodeClient((UUID.randomUUID()).getLeastSignificantBits());
            client.setNomClient(faker.name().firstName());
            client.setAdresseClient(String.valueOf(faker.address().cityName()));

            this.clientRepository.save(client);

        }
        CompteCourant cc = new CompteCourant();
        CompteEpargne ce = new CompteEpargne();
        cc.setSolde(2000);
        cc.setCodeCompte("CC1");
        cc.setDecouvert(10.5);

        ce.setSolde(3000);
        ce.setCodeCompte("CC2");
        ce.setTaux_interet(15);
        List<Compte> lstComptes = Arrays.asList(ce, cc);


        Client newClient = new Client();
        newClient.setNomClient("test");
        newClient.setAdresseClient("Bizerte");
        newClient.setEmailClient("test@gmail.com");
        newClient.setComptes(lstComptes);
        cc.setClient(newClient);
        ce.setClient(newClient);
        clientRepository.save(newClient);
        compteCourantRepository.save(cc);
        compteEpargneRepository.save(ce);
        ;
    }
        public static void main (String[]args){
            SpringApplication.run(BanqueDsiApplication.class, args);
        }

    }



