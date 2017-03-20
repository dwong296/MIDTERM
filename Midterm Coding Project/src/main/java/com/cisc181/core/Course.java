package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course 
{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course()
	{
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major)
	{
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
		this.Major = major;
	}
	
	public UUID getCourseID() 
	{
		return CourseID;
	}
	
	public void setCourseID(UUID courseID) 
	{
		this.CourseID = courseID;
	}
	
	public String getCourseName() 
	{
		return CourseName;
	}
	
	public void setCourseName(String courseName) 
	{
		this.CourseName = courseName;
	}
	
	public int getGradePoints() 
	{
		return GradePoints;
	}
	
	public void setGradePoints(int gradePoints) 
	{
		this.GradePoints = gradePoints;
	}
	public eMajor getMajor() 
	{
		return Major;
	}
	
	public void setMajor(eMajor major) 
	{
		this.Major = major;
	}
}
