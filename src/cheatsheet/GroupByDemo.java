package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class GroupByDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        //key will be gender and value will be Employees
        Map<String, List<Employee>> groupByGender = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDept()));

        //Key will be gender and value will Name List
        Map<String, List<String>> nameList = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        //Key will be gender and value will be gender count
        Map<String, Long> genderCount = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));

        genderCount.forEach((gender, count) -> {
            System.out.println(gender + " " + count);
        });


    }
}
