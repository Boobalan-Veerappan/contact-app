package com.heraizen.cj.day3;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class profile_list{
	 String  Name;
	String Mobile_number;
	int age;
	String Email;
	int Id;
	public profile_list(int Id,String name,String number,int age,String email)
	{
		this.Name = name;
		this.Mobile_number = number;
		this.age = age;
		this.Email = email;
		this.Id = Id;
	}
	public void  generate_Id()
	{
		this.Id = ThreadLocalRandom.current().nextInt(1000,9999);
	}

}

public class profile_project {

	public static void main(String[] args) {

		profile_list p1 = new profile_list(1001,"boobalan","7200212302",22,"boobalanv2016@gmail.com");
		profile_list p2 = new profile_list(1002,"raghul","9123520948",24,"raghulkannan@gmail.com");
		profile_list p3 = new profile_list(1003,"guna","7810836808",10,"gunaseelan@gmail.com");
		profile_list p4 = new profile_list(1004,"elavarasan","8667791470",220,"elavarasanm@gmail.com");
		profile_list p5 = new profile_list(1005,"kavin kp","7200212302",20,"kavinkp@gmail.com");
		profile_list[] list= {p1,p2,p3,p4,p5};
		profile_details pd =new profile_details();
		pd.start(list);
		
		
	}
	
}
class profile_details{
profile_list details_array[];
Scanner sc = new Scanner(System.in);
public void start(profile_list[] arr)
{
	this.details_array = arr;
	
	do {
		System.out.println(
				"\n---------------------------Contact Management System-------------------------------------\n");
		System.out.println("1.ADD\t2.VIEW ALL\t3.EDIT\t4.DELETE\t5.SEARCH\t6.SORT\t7.EXIT ");
		System.out.println(
				"\n------------------------------------------------------------------------------------------\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			this.Add_employee();
			break;
		case 2:
			this.ViewAll();
			break;
		case 3:
			this.editEach();
			break;
		case 4:
			this.DeleteEach();
			break;
		case 5:
			this.searchEach();
			break;
		case 6:
			this.sortEach();
			break;
		case 7:
			sc.close();
			System.exit(0);
		}
	}while(true);
	

}
void sortEach()
{
System.out.println("Sort : 1. Name 2.Email 3.Age");
profile_list[] arr = new profile_list[details_array.length];
System.arraycopy(details_array, 0, arr, 0, details_array.length);
//arr = details_array;
	int sort = sc.nextInt();
	switch(sort)
	{
	case 1:{
		this.nameSort(arr);
		break;
	}
	case 2:{
		this.emailSort(arr);
		break;
	}
	case 3:{
		this.ageSort(arr);
		break;
	}
	default:{
		
	}
	}
	
	
}
void emailSort(profile_list[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i].Email.compareTo(arr[j].Email)<0)
			{
				profile_list temp = new profile_list(0,null,null,0,null);
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.format("\n%-7s%-15s%-15s%-25s%3d",arr[i].Id,arr[i].Name,arr[i].Mobile_number ,arr[i].Email ,arr[i].age);
	}
}
void nameSort(profile_list[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i].Name.compareTo(arr[j].Name)<0)
			{
				profile_list temp = new profile_list(0,null,null,0,null);
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.format("\n%-7s%-15s%-15s%-25s%3d",arr[i].Id,arr[i].Name,arr[i].Mobile_number ,arr[i].Email ,arr[i].age);
	}
	
}

void ageSort(profile_list[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i].age<arr[j].age)
			{
				profile_list temp = new profile_list(0,null,null,0,null);
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.format("\n%-7s%-15s%-15s%-25s%3d",arr[i].Id,arr[i].Name,arr[i].Mobile_number ,arr[i].Email ,arr[i].age);
	}
}
void searchEach()
{
	System.out.println("Enter the Search String( name, Mobile Number,Email )");
	String search = sc.next();
	boolean isSearch = false;
	for(profile_list arr :details_array)
	{
		if(arr.Name.contains(search) || arr.Mobile_number.contains(search)||arr.Email.contains(search))
		{
			isSearch = true;
			System.out.format("\n%-7s%-15s%-15s%-25s%3d",arr.Id,arr.Name,arr.Mobile_number ,arr.Email ,arr.age);
		}
	}
	if(!isSearch)
	{
		System.out.println("There are no matched records found for given search data");
	}
}
void editEach()
{
	
	int Id;
	
	profile_list list = new profile_list(0,null,null,0,null);
	boolean isEdit = true;
	while(isEdit) {
		System.out.println("Enter the Id : ");
	Id = sc.nextInt();
	for(profile_list arr :details_array)
	{
		
		if(arr.Id == Id)
		{
			
			list = arr;
			isEdit = false;
		}
	}
	if(isEdit) {
		continue;
	}
	}
	System.out.println(list.Id+"  "+list.Name+"  "+list.Mobile_number+"  "+list.Email+"  "+list.age);
	System.out.println("Update  1.Name  2.Mobile 3.Email 4.Age ");
	int update = 0;
	update = sc.nextInt();
	boolean isupdate = false;
	while(!isupdate) {
	if(update<=5)
	{
		isupdate = true;
		switch(update) {

		case 1:
		{
			System.out.println("Enter the New Name");
			String Name = sc.next();
			list.Name = Name;
			this.ViewAll();
			break;
		}
		case 2:
		{
			boolean isMobileValid = false;
			System.out.println("Enter the New Mobile");
			String NewMobile = sc.next();
			isMobileValid = this.checkContainDigits(NewMobile);
			while(!isMobileValid)
			{
				System.out.println("Enter the new Person Valid MobileNumber : ");
				NewMobile = sc.next();
				isMobileValid = this.checkContainDigits(NewMobile);
			}
			list.Mobile_number = NewMobile;
			break;
		}
		case 3:
		{
			boolean isEmailValid = false;
			boolean isDuplicate = false;
			System.out.println("Enter the New Email");
			String Email = sc.next();
			isEmailValid = isValidEmail(Email);
			isDuplicate = isDuplicateEmail(Email);
			if(isDuplicate)
			{
				System.out.println("The Email Id is already Exist please enter the valid mail");
			}
			while(!isEmailValid || isDuplicate)
			{
				
				System.out.println("Enter the new Person Valid Email ID : ");
				
				 Email = sc.next();
				 isEmailValid = isValidEmail(Email);
				 isDuplicate = isDuplicateEmail(Email);
				 if(isDuplicate)
				 {
					 System.out.println("The Email Id is already Exist please enter the valid mail");
				 }
			}
			list.Mobile_number = Email;
			break;
		}
		case 4:{
			System.out.println("Enter the current age");
			int age = sc.nextInt();
			list.age = age;
			break;
		}
		}
	}
	else {
		System.out.println("please type valid one");
		update = sc.nextInt();
		isupdate = false;
	}
}
	
}
void DeleteEach()
{
	System.out.println("Enter the Valid Id for Delete");
	int num = 0;
	 
	int j=0;
	profile_list[] Deletelist = new profile_list[details_array.length-1] ;
	boolean isDeleteValid = false;
	while(!isDeleteValid) {
	num = sc.nextInt();
	isDeleteValid = isIdFound(num);
	if(isDeleteValid) {
	for(profile_list arr:details_array)
	{
		if(arr.Id == num)
		{
			isDeleteValid = true;
			continue;
		}
		else {
			Deletelist[j] = arr;
			j++;
		}
	}
	}
	else if(!isDeleteValid)
	{
		System.out.println("With the entred Id , there is no Contact");
	}
	}
	details_array = Deletelist;
	
}
boolean isIdFound(int Id)
{
	for(profile_list arr:details_array)
	{
		if(arr.Id == Id)
		{
			return true;
			
		}
		else {
			
		}
	}
	return false;
}
void Add_employee()
{
	profile_list[] Dlist = new profile_list[details_array.length+1] ;
	System.arraycopy(details_array, 0, Dlist, 0, details_array.length);

	boolean isMobileValid = false;
	boolean isEmailValid = false;
	boolean isDuplicate = false;
	System.out.println("Enter the new Person Name : ");
	String Name = sc.next();
	System.out.println("Enter the new Person MobileNumber : ");
	String Mobile = sc.next();
	isMobileValid = this.checkContainDigits(Mobile);
	while(!isMobileValid)
	{
		System.out.println("Enter the new Person Valid MobileNumber : ");
		 Mobile = sc.next();
		isMobileValid = this.checkContainDigits(Mobile);
	}
	System.out.println("Enter the new Person Email Id");
	String Email = sc.next();
	isEmailValid = isValidEmail(Email);
	isDuplicate = isDuplicateEmail(Email);
	if(isDuplicate)
	{
		System.out.println("The Email Id is already Exist please enter the valid mail");
	}
	while(!isEmailValid || isDuplicate)
	{
		
		System.out.println("Enter the new Person Valid Email ID : ");
		
		 Email = sc.next();
		 isEmailValid = isValidEmail(Email);
		 isDuplicate = isDuplicateEmail(Email);
		 if(isDuplicate)
		 {
			 System.out.println("The Email Id is already Exist please enter the valid mail");
		 }
	}
	System.out.println("Enter the new Person age : ");
	int age = sc.nextInt();
	profile_list pdf = new profile_list(0,Name,Mobile,age,Email);
	pdf.generate_Id();
	Dlist[Dlist.length-1] = pdf;
	System.out.println("The Auto Generate ID for new Person : "+pdf.Id);
  
   details_array = Dlist;
}

boolean isDuplicateEmail(String email)
{
	for(profile_list arr : details_array)
	{
		if(arr.Email.equals(email))
		{
			return true;
		}
	}
	return false;
}

void ViewAll()
{
	for(int i=0;i<details_array.length;i++)
	{
		System.out.format("\nID : %-7sName : %-15s   Mobile Number : %-15s Email : %-25s  Age : %d",details_array[i].Id,details_array[i].Name,details_array[i].Mobile_number,details_array[i].Email,details_array[i].age);
	}
}
private boolean checkContainDigits(String mobile) {
	Pattern pattern = Pattern.compile("\\d{10}");
	Matcher matcher = pattern.matcher(mobile);
	boolean isvalid = matcher.matches();
	return isvalid;
}
private boolean isValidEmail(String email) {
	String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
}
}

