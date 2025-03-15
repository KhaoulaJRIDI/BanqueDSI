package app.banque.banquedsi.exceptions;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long codeClient) {
        super("Could not find Client " + codeClient);
    }

}
