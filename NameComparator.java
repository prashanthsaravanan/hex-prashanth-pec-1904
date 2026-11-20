package day1hw;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentEdu>{

	@Override
	public int compare(StudentEdu o1,StudentEdu o2) {
		return o1.name.compareTo(o2.name);
	}
}

