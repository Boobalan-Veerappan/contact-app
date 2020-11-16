package com.heraizen.cj.day1;

public class autoGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3,i=0,j=1;
loop:
	for(i=1;i<=n;i++) {
		
switch(i)
{

case 1:{
	
	if(i!=j)
	{
		System.out.println(j+" "+i);
	}
	break;
}
case 2:{
	
	if(i!=j)
	{
		System.out.println(j+" "+i);
	}
	break;
}
case 3:{
	
	if(i!=j)
	{
		System.out.println(j+" "+i);
		i=0;
		j++;
		continue loop;
	}
	else
	{
		break;
	}
	
	
	
}

}
	}
	}

}
