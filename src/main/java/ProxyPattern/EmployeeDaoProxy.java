package ProxyPattern;

import java.security.AccessControlException;

//Proxy for access control
public class EmployeeDaoProxy implements EmployeeDao{

    //has-a EmployeeDao
    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void add(String client, Employee employee) {
        if(client.equals("ADMIN")) {
            employeeDao.add(client,employee);
        }
        throw new AccessControlException("Access denied");
    }

    @Override
    public void delete(String client, Employee employee) {
        if(client.equals("ADMIN")) {
            employeeDao.delete(client,employee);
        }
        throw new AccessControlException("Access denied");
    }
}
