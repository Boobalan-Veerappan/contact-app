package com.heraizen.cj.day1;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5,m=0;
for(int i=1;i<=n;i++)
{
	m=0;
	for(int j=1;j<=i;j++)
	{
		m++;
		System.out.print(m+" ");
	}
	for(int j=1;j<=i-1;j++)
	{
		m--;
		System.out.print(m+" ");
	}
	System.out.println();
}
	}

}
