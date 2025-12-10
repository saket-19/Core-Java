package rays.sorting;
import java.util.*;

public class Employees implements Comparable<Employees> {
	private int id ;
	private String name;
	private int salary;
	
   public Employees(int id , String name , int salary) {
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	}
   
   
   
   
   public String toString() {
	   return "id : " +id + " name : " +name + " salary : " +salary;
   }




@Override
public int compareTo(Employees o) {
	if(this.salary==o.salary) {
		return this.name.compareTo(o.name);
	}
	if(this.name==o.name) {
		return this.salary-o.salary;
	}
	return this.id-o.id;
}
	 
	  
	    
}
   


