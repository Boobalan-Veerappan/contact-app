package com.heraizen.cj.day1;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4,m=19;;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(i==j)
		{
			System.out.print(m+" ");
		}
		else {
			System.out.print("0 ");
		}
	}
	System.out.println();
}
	}

}
