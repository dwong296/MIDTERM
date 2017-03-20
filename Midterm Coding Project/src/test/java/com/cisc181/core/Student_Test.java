package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import com.cisc181.core.PersonException;
public class Student_Test 
{
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	static ArrayList<Enrollment>phys_fall = new ArrayList<Enrollment>();
	static ArrayList<Enrollment>cisc_fall = new ArrayList<Enrollment>();
	static ArrayList<Enrollment>chem_fall = new ArrayList<Enrollment>();
	
	static ArrayList<Enrollment>phys_spring = new ArrayList<Enrollment>();
	static ArrayList<Enrollment>cisc_spring = new ArrayList<Enrollment>();
	static ArrayList<Enrollment>chem_spring = new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws PersonException
	{
		Course physics = new Course(UUID.randomUUID(),"physics",100, eMajor.PHYSICS);
		Course comp_sci = new Course(UUID.randomUUID(),"comp sci",100, eMajor.COMPSI);
		Course chemistry = new Course(UUID.randomUUID(),"chemistry",100, eMajor.CHEM);
		
		courses.add(physics);
		courses.add(comp_sci);
		courses.add(chemistry);
		
		Semester fall = new Semester(UUID.randomUUID(), new Date(2016, 8, 30), new Date(2016, 12, 10));
		Semester spring = new Semester(UUID.randomUUID(), new Date(2017, 2, 10), new Date(2017, 5, 30));
		
		semesters.add(fall);
		semesters.add(spring);
		
		Section physFall = new Section(physics.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 12);
		Section compsciFall = new Section(comp_sci.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 11);
		Section chemFall = new Section(chemistry.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 13);
		
		Section physSpring = new Section(physics.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 22);
		Section compsciSpring = new Section(comp_sci.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 21);
		Section chemSpring = new Section(chemistry.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 23);
		
		sections.add(physFall);
		sections.add(compsciFall);
		sections.add(chemFall);
		sections.add(physSpring);
		sections.add(compsciFall);
		sections.add(chemSpring);
		
		Calendar dob = Calendar.getInstance();
		dob.set(2017, 1, 1);
		
		Student std1 = new Student("Derek", "A", "Wong", dob.getTime(), eMajor.COMPSI, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std2 = new Student("Derek", "B", "Wong", dob.getTime(), eMajor.BUSINESS, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std3 = new Student("Derek", "C", "Wong", dob.getTime(), eMajor.CHEM, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std4 = new Student("Derek", "D", "Wong", dob.getTime(), eMajor.NURSING, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std5 = new Student("Derek", "E", "Wong", dob.getTime(), eMajor.PHYSICS, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std6 = new Student("Derek", "F", "Wong", dob.getTime(), eMajor.COMPSI, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std7 = new Student("Derek", "G", "Wong", dob.getTime(), eMajor.BUSINESS, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std8 = new Student("Derek", "H", "Wong", dob.getTime(), eMajor.CHEM, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std9 = new Student("Derek", "I", "Wong", dob.getTime(), eMajor.NURSING, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		Student std10 = new Student("Derek", "J", "Wong", dob.getTime(), eMajor.PHYSICS, "20 Ray Street",
				"(261)-234-4934", "d.wongwizzler@gmail.com");
		
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);
		students.add(std7);
		students.add(std8);
		students.add(std9);
		students.add(std10);
		
		ArrayList<Integer> grade1 = new ArrayList<Integer>(Arrays.asList(95, 92, 85, 84, 79, 75, 69, 63, 95, 32));
		ArrayList<Integer> grade2 = new ArrayList<Integer>(Arrays.asList(98, 93, 86, 85, 78, 75, 66, 65, 99, 55));
		ArrayList<Integer> grade3 = new ArrayList<Integer>(Arrays.asList(96, 94, 89, 83, 77, 72, 66, 62, 92, 49));
		
		for (int i = 0; i < students.size();i++)
		{
			phys_fall.add(new Enrollment(students.get(i).getStudentID(),sections.get(0).getSectionID()));
			cisc_fall.add(new Enrollment(students.get(i).getStudentID(),sections.get(1).getSectionID()));
			chem_fall.add(new Enrollment(students.get(i).getStudentID(),sections.get(2).getSectionID()));
			phys_spring.add(new Enrollment(students.get(i).getStudentID(),sections.get(3).getSectionID()));
			cisc_spring.add(new Enrollment(students.get(i).getStudentID(),sections.get(4).getSectionID()));
			chem_spring.add(new Enrollment(students.get(i).getStudentID(),sections.get(5).getSectionID()));
		
			phys_fall.get(i).setGrade(grade1.get(i));
			cisc_fall.get(i).setGrade(grade2.get(i));
			chem_fall.get(i).setGrade(grade3.get(i));
			phys_spring.get(i).setGrade(grade1.get(i));
			cisc_spring.get(i).setGrade(grade2.get(i));
			chem_spring.get(i).setGrade(grade3.get(i));
		}		
	}
	
	public double calcStudentGPA(ArrayList<Enrollment> phys_fall, ArrayList<Enrollment> cisc_fall, ArrayList<Enrollment> chem_fall,
			ArrayList<Enrollment> phys_spring, ArrayList<Enrollment> cisc_spring, ArrayList<Enrollment> chem_spring, int Student) {
		
		//Constant declared for the number of courses
		final int COURSE_NUM = 6;
		
		double gpa = 0;

		if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 95) 
		{
			gpa = 4.0;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 90) 
		{
			gpa = 3.75;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 85)
		{
			gpa = 3.50;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 80)
		{
			gpa = 3.00;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 75) 
		{
			gpa = 2.50;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 70) 
		{
			gpa = 2.00;
		} 
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 65) 
		{
			gpa = 1.50;
		}
		else if ((phys_fall.get(Student).getGrade() + cisc_fall.get(Student).getGrade() + chem_fall.get(Student).getGrade()
				+ phys_spring.get(Student).getGrade() + cisc_spring.get(Student).getGrade() + chem_spring.get(Student).getGrade())
				/ COURSE_NUM >= 60)
		{
			gpa = 1.00;
		} 
		else
		{
			gpa = 0.00;
		}
		return gpa;
	}
	
	@Test
	public void StudentGPATest() 
	{
		assertEquals(4.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 0), .001);
		assertEquals(3.75, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 1), .001);
		assertEquals(3.5, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 2), .001);
		assertEquals(3.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 3), .001);
		assertEquals(2.5, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 4), .001);
		assertEquals(2.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 5), .001);
		assertEquals(1.5, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 6), .001);
		assertEquals(1.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 7), .001);
		assertEquals(4.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 8), .001);
		assertEquals(0.0, calcStudentGPA(phys_fall, cisc_fall, chem_fall, phys_spring, cisc_spring, chem_spring, 9), .001);
	}
	
	public static double CourseAvg(ArrayList<Enrollment> courses) 
	{
		double x = 0;
		double average = 0;

		for (int i = 0; i < students.size(); i++) 
		{
			x += courses.get(i).getGrade();
			average = (x / students.size());
		}
		return average;
	}
	@Test
	public void testCourseAvg() 
	{
		assertEquals(76.9, CourseAvg(phys_fall), .01);
		assertEquals(80.0, CourseAvg(cisc_fall), 01);
		assertEquals(78.0, CourseAvg(chem_fall), .01);
		assertEquals(76.9, CourseAvg(phys_spring), .01);
		assertEquals(80.0, CourseAvg(cisc_spring), 01);
		assertEquals(78.0, CourseAvg(chem_spring), .01);
	}
	
	public static void ChangeOfMajor(eMajor major, Student student) 
	{
		student.setMajor(major);
	}
	
	@Test
	public void testMajorChangeStudent() 
	{
		ChangeOfMajor(eMajor.CHEM, students.get(5));
		assertEquals(eMajor.CHEM, students.get(5).getMajor());
	}
}