public class CommercialProject extends CommercialMilitaryProject{
    private long marketingFunds;
    public long getMarketingFunds() {
        return marketingFunds;
    }
    public CommercialProject(String manager, String titlu, String obiectiv, long fonduri,int numarMembri, String deadline,
            long marketingFunds) {
        super(manager, titlu, obiectiv, fonduri,numarMembri, deadline);
        this.marketingFunds = marketingFunds;
    }
    public double getRisk()
    {
        return getNumarechipe()*3/getNumarMembri()/(getFonduri()-marketingFunds);
    }
}
