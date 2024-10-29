package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */
public class LimitDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        List<Integer> integerList = Arrays.asList(12, 56, 76, 89, 87, 65, 43);

        List<Employee> topPaidEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .toList();

        //Retrieve the first 3 elements of an integer list that are greater than 50.

        List<Integer> topThreeList = integerList.stream()
                .filter(e -> e > 50)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .limit(3)
                .toList();

        System.out.println(topThreeList);

    }
}
