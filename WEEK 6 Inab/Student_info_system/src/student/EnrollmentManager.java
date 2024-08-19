package student;

public class EnrollmentManager implements IEnrollement {

	@Override
	 public void enroll(ISstudent student, Icourse course) {
        student.enrollInCourse(course.getCourseID());
        course.enrollStudent(student.getStudentID());
        System.out.println("Student " + student.getName() + " has been enrolled in course " + course.getCourseName());
    }
}