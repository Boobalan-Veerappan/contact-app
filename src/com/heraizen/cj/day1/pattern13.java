package com.heraizen.cj.day1;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8,m=0;
for(int i=1;i<=n;i++)
{
	for(int j=m;j>=1;j--)
	{
		System.out.print(n-(j-1)+" ");
	}
	for(int j=1;j<=n-m;j++)
	{
		System.out.print(j+" ");
	}
	
	m++;
	System.out.println();
}
	}

}
