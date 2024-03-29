package transport;

public class Mechanics <M extends Transport> {
    private String fullName;
    private String company;

    public Mechanics(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void maintenance(M Transport){
        System.out.println(fullName + " " +"Выполнил ТО авто "+ Transport.getBrand() + " " + Transport.getModel());
    }
    public void fixTheCar(){
        System.out.println("Ремонт авто");

    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

