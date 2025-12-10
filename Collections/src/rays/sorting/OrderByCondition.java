package rays.sorting;

import java.util.Comparator;

public class OrderByCondition implements Comparator<School>{
	@Override
	public int compare(School o1, School o2) {
		if(o1.name==o2.name) {
			return o1.marks-o2.marks;
		}
		else if(o1.marks==o2.marks) {
			return o1.rollno-o2.rollno;
		}
		
			return o1.rollno-o2.rollno;
		
	}
	
}
