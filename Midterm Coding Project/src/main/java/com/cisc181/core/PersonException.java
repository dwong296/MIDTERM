package com.cisc181.core;

public class PersonException extends Exception 
{
	private Person person;
	
	public PersonException(Person person)
	{
		super("Not good");
		this.person = person;
	}
	
	public Person getPerson()
	{
		return person;
	}
}
