package rays.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<School>{
	@Override
	public int compare(School o1, School o2) {
		
		return o1.name.compareTo(o2.name);
	}
	

}
