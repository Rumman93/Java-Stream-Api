package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 29 Oct 2024
 */
public class FilterDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        List<Employee> development = employeeList.stream()
                .filter(e -> e.getDept().equals("Development")).toList();

        development.forEach(
                System.out::println
        );

        Map<Integer, String> developmentMap = employeeList.stream()
                .filter(e -> e.getDept().equals("Development"))
                .collect(Collectors.toMap(Employee::getId, Employee::getDept));

        
    }
}
