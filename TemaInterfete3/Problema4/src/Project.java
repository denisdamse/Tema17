import java.util.ArrayList;

public abstract class Project implements Risky{
    private String manager;
    private String titlu;
    private String obiectiv;
    private long fonduri;
    private int numarMembri;
    private int numarechipe;
    public Project(String manager, String titlu, String obiectiv, long fonduri, int numarMembri) {
        this.manager = manager;
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
        this.numarMembri=numarMembri;
        numarechipe++;
    }
    public abstract double getRisk();
    public ArrayList<Member> membri = new ArrayList<Member>();
    public int getNumarechipe() {
        return numarechipe;
    }
    public void addMember(Member m)
    {
        membri.add(m);
    }
    public String getManager() {
        return manager;
    }
    public String getTitlu() {
        return titlu;
    }
    public String getObiectiv() {
        return obiectiv;
    }
    public long getFonduri() {
        return fonduri;
    }
    public ArrayList<Member> getMembri() {
        return membri;
    }
    public int getNumarMembri() {
        return numarMembri;
    }
}