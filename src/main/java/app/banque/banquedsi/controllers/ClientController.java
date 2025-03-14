package app.banque.controllers;

import app.banque.entities.Client;
import app.banque.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
      Client savedClient=   clientRepository.save(client);
        return ResponseEntity.status(201).body(savedClient);

    }
    @DeleteMapping("deleteClient")
    public void deleteClient(@RequestBody Client client)
    {
        clientRepository.delete(client);
    }

    @GetMapping("clientById")
    public Optional<Client> getClientById(@RequestParam("id") Long id) {
        return clientRepository.findById(id);
    }


    @GetMapping("clientByName")
    public Client getClientByName(@PathVariable("name") String name) {
        return clientRepository.findByNomClient(name);
    }

    @PutMapping("updateClient")
    public Client updateClient(@RequestBody Client client) {
        return clientRepository.save(client);

    }
}