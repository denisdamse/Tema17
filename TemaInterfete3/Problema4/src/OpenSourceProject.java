public class OpenSourceProject extends Project{
    private String MailingList;
    public String getMailingList() {
        return MailingList;
    }
    public OpenSourceProject(String manager, String titlu, String obiectiv, long fonduri,int numarMembri, String mailingList,
            int number) {
        super(manager, titlu, obiectiv, fonduri,numarMembri);
        MailingList = mailingList;
    }
    public double getRisk()
    {
        return getNumarMembri()/getFonduri();
    }
}
