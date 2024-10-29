package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class MinMaxDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        //min
        Optional<Employee> minSalary = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));

        Optional<Employee> maxSalary = employeeList.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary()));

        System.out.println(minSalary);

        System.out.println(maxSalary);
    }
}
