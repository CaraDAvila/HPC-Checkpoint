package entities;

public class Message {
String name;
String contact;
int filaReclamacao;
int filaSugestao;
String message;

    public Message(String name, String contact, int contactReason, String message) {
        this.name = name;
        this.contact = contact;
        this.filaReclamacao = filaReclamacao;
        this.filaSugestao = filaSugestao;
        this.message = message;
    }


}
