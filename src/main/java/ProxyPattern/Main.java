package ProxyPattern;

/**
 * Uses:
 * 1. Access control
 * 2. Caching
 * 3. Preprocessing and postprocessing
 */

public class Main {

    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.add("ADMIN", new Employee());
        employeeDao.add("USER", new Employee());
    }
}
