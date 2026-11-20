package day1hw;

import java.util.*;

//import assignmentcomparable.NameComparator;

public class Driver {

	public static void main(String[] args) {
		
		List<StudentEdu> l = new ArrayList<StudentEdu>();
		l.add(new StudentEdu(101,"java",15000));
		l.add(new StudentEdu(103,"react",15000));
		l.add(new StudentEdu(102,"python",12000));
		l.add(new StudentEdu(105,"angular",12000));
		l.add(new StudentEdu(104,"sql",8000));
		
		
		System.out.println("********** asc *****");
		sortFee(l,"asc");
		
		System.out.println("********** desc *****");
		sortFee(l,"desc");
		
		System.out.println("**** asc for name***");
		
		Collections.sort(l,new NameComparator());
		for(StudentEdu s : l) {
			System.out.println(s);
		}
		
	}
	
	public static void sortFee(List<StudentEdu> l1,String direction) {
		Collections.sort(l1,new SortByfee(direction));
		for(StudentEdu se : l1) {
			System.out.println(se);
		}
	}

}
