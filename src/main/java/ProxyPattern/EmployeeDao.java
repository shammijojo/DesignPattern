package ProxyPattern;

public interface EmployeeDao {

    void add(String client, Employee employee);
    void delete(String client, Employee employee);

}
