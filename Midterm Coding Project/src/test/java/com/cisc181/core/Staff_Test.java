package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.PersonException;
import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	@BeforeClass
	public static void setup() 
	{
		
	}
	
	@Test
	public void testAverageSalary() throws PersonException 
	{
		ArrayList<Staff> staff= new ArrayList<Staff>();
		Calendar dob = Calendar.getInstance();
		Calendar hire = Calendar.getInstance();

		dob.set(1998, 1, 1);
		hire.set(2017, 1, 1);
		
		Staff staff1 = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 1000, hire.getTime(),eTitle.MR);
		Staff staff2 = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 2000, hire.getTime(),eTitle.MR);
		Staff staff3 = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 3000, hire.getTime(),eTitle.MR);
		Staff staff4 = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 4000, hire.getTime(),eTitle.MR);
		Staff staff5 = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 5000, hire.getTime(),eTitle.MR);
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		
		double total = 0;
		int avg = 0;
		for (Staff s: staff)
		{
			total = total + s.getSalary();
		}
		avg= (int)(total/staff.size());
		assertEquals(avg, 3000);
	}
	
	@Test(expected = PersonException.class)
	public void testAgeException() throws PersonException
	{
		Calendar dob = Calendar.getInstance();
		Calendar hire = Calendar.getInstance();

		dob.set(1800, 1, 1);
		hire.set(2017, 1, 1);
		
		Staff staff = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "(267)-222-0486",
				"derekwon@udel.edu", "None", 1, 1000, hire.getTime(),eTitle.MR);
	}
	
	@Test(expected = PersonException.class)
	public void testPhoneException() throws PersonException
	{
		Calendar dob = Calendar.getInstance();
		Calendar hire = Calendar.getInstance();

		dob.set(1998, 1, 1);
		hire.set(2017, 1, 1);
		
		Staff staff = new Staff("Derek","M.","Wong", dob.getTime(), "Ray Street C", "2",
				"derekwon@udel.edu", "None", 1, 1000, hire.getTime(),eTitle.MR);
	}
}
