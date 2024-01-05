public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String adres, String school, double pay) {
        super(name, adres);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff(String name, String adres) {
        super(name, adres);
    }
}
