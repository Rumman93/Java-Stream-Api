package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;
import java.util.Optional;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class FindDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(e -> e.getDept().equals("Dev"))
                .findFirst();

        Optional<Employee> anyEmployee = employeeList.stream()
                .filter(e -> e.getGender().equals("Male"))
                .findAny();

        System.out.println(anyEmployee);
    }
}
