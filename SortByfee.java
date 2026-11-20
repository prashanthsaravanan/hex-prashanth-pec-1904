package day1hw;

import java.util.Comparator;

public class SortByfee  implements Comparator<StudentEdu>{

	String direction;
	
	public SortByfee(String direction) {
		this.direction = direction;
	}
	
	@Override
	public int compare(StudentEdu o1, StudentEdu o2) {
		if(direction.equals("asc")) {
			if(o1.fee > o2.fee) {
				return 1;
			}else if(o1.fee < o2.fee) {
				return -1;
			}
		}
		else {
			if(o1.fee < o2.fee) {
				return 1;
			}else if(o1.fee > o2.fee) {
				return -1;
			}
		}
		
		return 0;
	}
	
	
}
