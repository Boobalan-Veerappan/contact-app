package com.heraizen.cj.day1;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9,m=9,k=0;;
for(int i=1;i<=9;i++)
{
	for(int j=1;j<=9;j++)
	{
		if((k==0&&i==1&&j<=((n/2)+1))||(j==((n/2)+1))||(k==0 && j==m)||(i==((n/2)+1))||(k==1&&j==1)||(k==1&&j>=((n/2)+1)&&i==n))
		{
			System.out.print("* ");
			if(i==(n/2)+1)
			{
				k=1;
			}
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
