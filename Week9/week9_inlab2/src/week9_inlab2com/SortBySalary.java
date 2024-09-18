package week9_inlab2com;

import java.util.Comparator;

//Comparator for sorting by Salary
class SortBySalary implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return Double.compare(e1.getSalary(), e2.getSalary());
 }
}

//Comparator for sorting by Name
class SortByName implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return e1.getName().compareTo(e2.getName());
 }
}

//Comparator for sorting by Department
class SortByDepartment implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return e1.getDepartment().compareTo(e2.getDepartment());
 }
}
