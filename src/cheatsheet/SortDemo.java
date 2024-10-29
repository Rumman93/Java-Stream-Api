package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.Comparator;
import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 29 Oct 2024
 */
public class SortDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();


        //sort in ascending order
        List<Employee> employeeList1 = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .toList();

        //Descending order
        List<String> deptListReversed = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDept).reversed())
                .map(Employee::getDept)
                .toList();

        List<Integer> idListReversed = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getId, Comparator.reverseOrder()))
                .map(Employee::getId)
                .toList();

        List<String> salaryList = employeeList.stream()
                .sorted((e1, e2) -> e2.getGender().compareTo(e1.getGender()))
                .map(Employee::getGender)
                .toList();

        System.out.println(salaryList);

    }
}
