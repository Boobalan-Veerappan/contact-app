package com.heraizen.cj.day1;

public class add_series_7_terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
double res,m=1,sum=0;

for(int i=1;i<=7;i++)
{
	
		m=m*i;
	res=(i/m);
	sum=sum+res;
	
}
System.out.printf("sum = %f",sum);
	}

}
