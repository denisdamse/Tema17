import java.util.ArrayList;

public class InvestmentCompany {
    public ArrayList<Project> proiecte = new ArrayList<Project>();
    
    public void addProject(Project p)
    {
        proiecte.add(p);
    }
    public Project getBestInvestMent()
    {   
        Project x=proiecte.get(0);
        double lowest=10000;
        for(Project p : proiecte)
        {
            if(p.getRisk()<lowest)
            {
                lowest=p.getRisk();
                x=p;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Project p1 = new CommercialProject("Oprea","Membrii Suceava","Nimic",100,3,"maine",100);
        Project p2 = new MilitaryProject("Alexandru Macedon","Macedonenii","Nimic",100,3,"poimaine","1980182");
        InvestmentCompany companie = new InvestmentCompany();
        companie.addProject(p1);
        companie.addProject(p2);
        System.out.println(companie.getBestInvestMent());
    }
}
