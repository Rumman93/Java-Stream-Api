package cheatsheet;

import dto.Employee;
import repostiroy.EmployeeDataBase;

import java.util.List;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 29 Oct 2024
 */
public class MapDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        //Get Dept
        List<String> deptList = employeeList.stream()
                .map(e -> e.getDept())
                .toList();

        //Get Dept (Method Reference)
        List<String> stringList = employeeList.stream()
                .map(Employee::getDept).toList();

        //Unique Dept
        List<String> uniqueDeptList = employeeList.stream()
                .map(Employee::getDept)
                .distinct()
                .toList();

        //Nested Attribute aka flatmap
        List<String> projectNameList = employeeList.stream()
                .flatMap(e -> e.getProjects().stream())
                .map(p -> p.getName())
                .toList();


        System.out.println(projectNameList);

    }
}
