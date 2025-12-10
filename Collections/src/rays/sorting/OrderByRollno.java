package rays.sorting;

import java.util.Comparator;

public class OrderByRollno implements Comparator<School>{
	@Override
	public int compare(School o1, School o2) {
		
		return o1.rollno-o2.rollno;
	}
	

}
