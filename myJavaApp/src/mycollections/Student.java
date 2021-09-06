package mycollections;

public class Student {

	int stid;
	String stname;
	String course;
	
	public Student(int stid, String stname, String course) {
		//super();
		this.stid = stid;
		this.stname = stname;
		this.course = course;
	}

	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	  @Override public String toString() { return "Student [stid=" + stid +
	  ", stname=" + stname + ", course=" + course + "]"; }
	 
	
	
}
