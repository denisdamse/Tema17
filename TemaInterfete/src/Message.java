public class Message {
    public Message(Person sender,Person receiver,String message)
    {
        this.sender=sender;
        this.receiver=receiver;
        this.message=message;
    }
    private Person sender;
    private Person receiver;
    private String message;
    public Person getSender() {
        return sender;
    }
    public Person getReceiver() {
        return receiver;
    }
    public String getMessage() {
        return message;
    }
       
}
