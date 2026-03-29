package com.example.mctask.McUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class McUser1 
{
	private String fname;
	@Id
	private String emailaddress;
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public String getEmailaddress()
	{
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress)
	{
		this.emailaddress=emailaddress;
	}
}
