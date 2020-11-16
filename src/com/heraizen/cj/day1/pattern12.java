package com.heraizen.cj.day1;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9;
for(int i=1;i<=n-2;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(i==1||i==n-2)
		{
			System.out.print("* ");
		}
		else if(j==6){
			System.out.print(" *");
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println();
}
	}

}
