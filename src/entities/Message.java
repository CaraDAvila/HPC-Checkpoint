package entities;

public class Message {
String name;
String contact;
int contactReason;
String message;

    public Message(String name, String contact, int contactReason, String message) {
        this.name = name;
        this.contact = contact;
        this.contactReason = contactReason;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getContactReason() {
        return contactReason;
    }

    public void setContactReason(int contactReason) {
        this.contactReason = contactReason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
