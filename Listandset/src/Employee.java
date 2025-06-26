//Create a class Employee with id, name, and salary.

//Store multiple objects in a List.

//Sort by salary in ascending order.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    int salary;

    
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
    	return id +""+name+" "+salary;
    }
       
 
    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(3, "AB", 102));
        list.add(new Employee(2, "AC", 100));
        list.add(new Employee(1, "AD", 101));

       
        list.sort(Comparator.comparingInt(emp -> emp.salary));

       System.out.println(list);
	   
    }
}

