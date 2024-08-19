package student;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EnrollmentManager enrollmentManager = new EnrollmentManager();

	        System.out.print("Enter student name: ");
	        String studentName = scanner.nextLine();
	        System.out.print("Enter student ID: ");
	        String studentID = scanner.nextLine();

	        student student = new UndergraduateStudent(studentID, studentName);

	        System.out.print("Enter course name: ");
	        String courseName = scanner.nextLine();
	        System.out.print("Enter course ID: ");
	        String courseID = scanner.nextLine();

	        course course = new course(courseID, courseName);

	        enrollmentManager.enroll(student, course);

	        System.out.println("\nStudent Information:");
	        student.printCourses();

	        System.out.println("\nCourse Information:");
	        course.printEnrolledStudents();

	        scanner.close();
	    }
	}