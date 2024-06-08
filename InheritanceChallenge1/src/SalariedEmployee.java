public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String birthDate, String endDate, String hireDate, double annualSalary) {
        super("Sham",birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}'+super.toString();
    }

    public void retire() {
        System.out.println("Retires in ");
    }
}
