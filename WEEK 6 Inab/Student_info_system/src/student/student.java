package student;

import java.util.ArrayList;
import java.util.List;

public class student implements ISstudent {
	 private String studentID;
	    private String name;
	    private List<String> enrolledCourses;
	    
	    public student(String studentID, String name) {
	        this.studentID = studentID;
	        this.name = name;
	        this.enrolledCourses = new ArrayList<>();
	    }

	@Override
	public String getStudentID() {
		 return studentID;
	}

	@Override
	public String getName() {
		  return name;
	}

	@Override
	public void enrollInCourse(String courseID) {
		   enrolledCourses.add(courseID);

	}

	@Override
	public void printCourses() {
		   System.out.println("Student " + name + " is enrolled in: " + enrolledCourses);
	}

}
