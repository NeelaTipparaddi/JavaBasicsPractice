public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name,String birthDate, String endDate, String hireDate){
        super(name,birthDate,endDate);
        this.hireDate=hireDate;
    }
    public Employee(String endDate){
        super("Ram","2010",endDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}'+super.toString();
    }
}
