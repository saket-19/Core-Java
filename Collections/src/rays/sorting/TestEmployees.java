package rays.sorting;
import java.util.*;

public class TestEmployees {
	public static void main(String[]args) {
		Employees e1=new Employees(101,"saket",40000);
		Employees e2=new Employees(102,"anshul",50000);
		Employees e3=new Employees(103,"abhishek",50000);
		Employees e4=new Employees(104,"sanjay",30000);
		Employees e5=new Employees(105,"anshul",70000);
		
		ArrayList list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		list.forEach(System.out::println);
		
	    System.out.println("List after sorting is : ");
	    Collections.sort(list);
	    list.forEach(System.out::println);
	    
	    
	   
	}

}
