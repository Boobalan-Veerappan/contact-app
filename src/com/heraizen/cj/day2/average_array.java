package com.heraizen.cj.day2;

public class average_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=18;
int sum = 0;
int []a= {3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,0};
for(int i=0;i<=14;i++)
{
	sum = sum+a[i];
}
//a[15] = sum;
int average = sum/n;
int smallest = a[0];
for(int i=0;i<n;i++)
{
	if(smallest>a[i]) {
		smallest = a[i];
	}
}
a[15] = sum;
a[16] = average;
a[17] = smallest;
for(int i=0;i<n;i++)
{
	System.out.print(a[i]+" ");
	if(i!=n-1)
	{
		System.out.print(",");
	}
}
	}

}
