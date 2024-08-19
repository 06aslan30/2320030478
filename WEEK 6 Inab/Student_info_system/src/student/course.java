package student;

import java.util.ArrayList;
import java.util.List;
public class course implements Icourse {
	  private String courseID;
	    private String courseName;
	    private List<String> enrolledStudents;

	    public course(String courseID, String courseName) {
	        this.courseID = courseID;
	        this.courseName = courseName;
	        this.enrolledStudents = new ArrayList<>();
	    }

	@Override
	public String getCourseID() {
		   return courseID;
	}

	@Override
	public String getCourseName() {
		return courseName;
			}

	@Override
	public void enrollStudent(String studentID) {
		enrolledStudents.add(studentID);

	}

	@Override
	public void printEnrolledStudents() {
		System.out.println("Course " + courseName + " has enrolled students: " + enrolledStudents);
    }

	}

