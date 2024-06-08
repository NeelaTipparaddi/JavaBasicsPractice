public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Neela", "2000", "2024");
        SalariedEmployee salEmployee = new SalariedEmployee("2020","2023","3893",120000);
        Employee employee = new Employee("Tim","2000","2050","3030");
        System.out.println(worker.getAge());
        System.out.println(salEmployee.getAge());
        System.out.println(employee.getAge());

        System.out.println(worker);
        System.out.println(salEmployee);
        System.out.println(employee);
    }


}
