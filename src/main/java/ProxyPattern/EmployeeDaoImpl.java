package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void add(String client, Employee employee) {
        System.out.println("Employee added ");
    }

    @Override
    public void delete(String client, Employee employee) {
        System.out.println("Employee deleted");
    }
}
