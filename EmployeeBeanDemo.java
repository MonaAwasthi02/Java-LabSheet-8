public class EmployeeBeanDemo {
    public static void main(String[] args) {
        EmployeeBean employee = new EmployeeBean();
        employee.setEmpId(501);
        employee.setEmpName("Neha Sharma");
        employee.setSalary(35000);

        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Serializable: " +
                (employee instanceof java.io.Serializable));
    }
}
