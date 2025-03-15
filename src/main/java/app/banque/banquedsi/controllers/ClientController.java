package app.banque.banquedsi.controllers;


import app.banque.banquedsi.entities.Client;
import app.banque.banquedsi.entities.Compte;
import app.banque.banquedsi.exceptions.ClientNotFoundException;
import app.banque.banquedsi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }


    @GetMapping("allClients")
    public List<Client> getAllClients() {

        return clientRepository.findAll();
    }

    @PostMapping("client")
    public Client addClient(@RequestBody Client client) {
        return clientRepository.save(client);


    }


    @GetMapping("clientById")
    public Client getClientById(@RequestParam("id") Long id) {

        return clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(id));
    }


    @GetMapping("/clients/{id}")
    Client one(@PathVariable Long id) {

        return clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(id));
    }


    @GetMapping("clientByName/{name}")
    public Collection<Client> getClientByName(@PathVariable("name") String name) {

        return clientRepository.findByNomClient(name);
    }

    @PutMapping("updateClient")
    public Client updateClient(@RequestBody Client client) {
        return clientRepository.save(client);

    }

    @PutMapping("/clients/{id}")
    Client replaceClient(@RequestBody Client client, @PathVariable Long id) {

        return clientRepository.findById(id)
                .map(newClient -> {
                    newClient.setNomClient(client.getNomClient());
                    newClient.setEmailClient(client.getEmailClient());
                    newClient.setAdresseClient(client.getAdresseClient());
                    return clientRepository.save(newClient);
                })
                .orElseGet(() -> {
                    client.setCodeClient(id);
                    return clientRepository.save(client);
                });
    }

    @DeleteMapping("/clients/{id}")
    void deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }


}