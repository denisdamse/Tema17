public abstract class CommercialMilitaryProject extends Project{
    private String deadline;
    private final int MAXNUMBER=15;
    public String getDeadline() {
        return deadline;
    }
    public int getMaxNumber() {
        return MAXNUMBER;
    }
    public CommercialMilitaryProject(String manager, String titlu, String obiectiv, long fonduri, int numarMembri, String deadline) {
        super(manager, titlu, obiectiv, fonduri,numarMembri);
        this.deadline = deadline;
    }
    public abstract double getRisk();
}
