package com.cisc181.core;

import java.util.UUID;

public class Section 
{
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section()
	{

	}
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) 
	{
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		this.SectionID = sectionID;
		this.RoomID = roomID;
	}
	
	public UUID getCourseID() 
	{
		return CourseID;
	}

	public void setCourseID(UUID courseID) 
	{
		this.CourseID = courseID;
	}

	public UUID getSemesterID() 
	{
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) 
	{
		this.SemesterID = semesterID;
	}

	public UUID getSectionID() 
	{
		return SectionID;
	}

	public void setSectionID(UUID sectionID) 
	{
		this.SectionID = sectionID;
	}

	public int getRoomID() 
	{
		return RoomID;
	}

	public void setRoomID(int roomID) 
	{
		this.RoomID = roomID;
	}
}
