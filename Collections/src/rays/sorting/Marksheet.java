package rays.sorting;
import java.util.*;

public class Marksheet implements Comparable<Marksheet> {
	private String rollno;
	private String name;
	private int physics;
	private int maths;
	private int chemistry;
	
	public Marksheet(String rollno,String name,int physics,int maths,int chemistry) {
		this.rollno=rollno;
		this.name=name;
		this.physics=physics;
		this.maths=maths;
		this.chemistry=chemistry;
		
	}
	
	@Override
	public int compareTo(Marksheet o) {
		
		//return this.physics-o.physics;  for getting elements in asc oder with reference to physics
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return "rollno: " + rollno + " name:  " + name + " physics:  " + physics + "maths: " +maths +"chemistry: , " +chemistry ;
	}

	

}
