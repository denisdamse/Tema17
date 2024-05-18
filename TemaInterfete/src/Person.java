public class Person {
    public Person(String name)
    {
        this.name=name;
    }
    private String name;
    Transmitter transmitter;
    public void setTransmitter(Transmitter t)
    {
        transmitter=t;
    }
    public String getName()
    {
        return this.name;
    }
    public void send(Person p, Message m)
    {
        transmitter.store(m);
        System.out.println(this.name+" said to "+p.getName()+"("+this.transmitter+"): "+m.getMessage());   
    }
}
