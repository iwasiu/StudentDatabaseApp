package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int yearLevel;
	private int studentID;
	private int noOfStudent;
	private String course;
	private int tuitionBalance;
	private int costOfCourse = 600;
	
	// constructor that prompt user to enter first and last names and grade year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		this.firstname = sc.nextLine().trim();
		
		System.out.println("Enter last name: ");
		this.lastname = sc.nextLine().trim();
		
		System.out.println("Enter grade year:\n1 - Gold\n2 - Silver\n3 - Diamond\n4 - Bronze");
		this.yearLevel = sc.nextInt();
		
		System.out.println("Name: "+this.lastname+" "+this.firstname+" "
		+"\nGrade Year: "+this.yearLevel);
		
	}
	
	
}
