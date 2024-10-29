package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class SkipDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        List<Employee> skippedFirstFiveEmployees = employeeList.stream()
                .skip(5)
                .toList();

        System.out.println(skippedFirstFiveEmployees);
    }
}
