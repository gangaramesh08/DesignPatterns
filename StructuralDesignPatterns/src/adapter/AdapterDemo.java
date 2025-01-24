package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        AdapterEmployeeInterface employee = new AdapterEmployeeInterfaceImpl(1,"Ganga","Ranesh","ganga@gmail.com");
        List<AdapterEmployeeInterface> employeeInterfaceList = new ArrayList<>();
        employeeInterfaceList.add(employee);
        AdapterEmployeeLDAP employeeLDAP = new AdapterEmployeeLDAP(2,"Ashwin","Karollil","Pinku@gmail.com");
        employeeInterfaceList.add(new AdapterLDAP(employeeLDAP));
        System.out.println(employeeInterfaceList);
    }
}
