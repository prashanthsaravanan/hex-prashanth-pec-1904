package day1hw;

public class StudentEdu {
	
	int id;
	String name;
	int fee;
	
	public StudentEdu(int id,String name,int fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "StudentEdu [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
	

}
