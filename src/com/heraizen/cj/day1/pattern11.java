package com.heraizen.cj.day1;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n-1;j++)
	{
		if(i==1||i==(n/2)+1||j==1||j== n-1)
		{
			System.out.print("@ ");
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
