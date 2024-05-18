import java.util.ArrayList;

public class MailTransmitter implements Transmitter{

    public MailTransmitter(int maxNumberOfMessages)
    {
        this.maxNumberOfMessages=maxNumberOfMessages;
    }
    @Override
    public Message retrieve(Person receiver) {
        return null;
    }

    @Override
    public void store(Message message) {
        if(bufferMessaje.size()<=maxNumberOfMessages)
        {
            bufferMessaje.add(message); 
        }
        else
        {
            bufferMessaje.clear();
        }
    }
    private ArrayList<Message> bufferMessaje = new ArrayList<Message>();
    private int maxNumberOfMessages;
    public ArrayList<Message> getBufferMessaje() {
        return bufferMessaje;
    }
    public int getMaxNumberOfMessages() {
        return maxNumberOfMessages;
    }
    
    
}
