package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class MatchDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        boolean developmentAnyMatch = employeeList.stream()
                .anyMatch(e -> e.getDept().equals("Development"));

        boolean developmentAllMatch = employeeList.stream()
                .allMatch(e -> e.getDept().equals("Development"));

        boolean departmentNoneMatch = employeeList.stream()
                .noneMatch(e -> e.getDept().equals("ERP"));

        System.out.println(departmentNoneMatch);
    }
}
