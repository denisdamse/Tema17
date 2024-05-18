public class MilitaryProject extends CommercialMilitaryProject{
    private String parola;

    public MilitaryProject(String manager, String titlu, String obiectiv, long fonduri, int numarMembri,String deadline,
            String parola) {
        super(manager, titlu, obiectiv, fonduri,numarMembri, deadline);
        this.parola = parola;
    }

    public String getParola() {
        return parola;
    }
    public double getRisk()
    {
        return getNumarMembri()/parola.length()/getFonduri();
    }
}
