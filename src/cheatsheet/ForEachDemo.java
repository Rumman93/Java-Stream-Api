package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 29 Oct 2024
 */
public class ForEachDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        //name & Salary
        employeeList.forEach(
                e -> System.out.println(e.getName() + " " + e.getSalary())
        );
    }
}
