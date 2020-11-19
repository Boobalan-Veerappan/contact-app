package com.heraizen.cj.day5;
class car implements game{
	public void stop()
	{
		System.out.println("car is stop");
	}
	public void start()
	{
		System.out.println("car is start");
	}
	public void play()
	{
		System.out.println("car is play");
	}
}
class bike implements game{
	public void stop()
	{
		System.out.println("bike is stop");
	}
	public void start()
	{
		System.out.println("bike is start");
	}
	public void play()
	{
		System.out.println("bike is play");
	}
}
class bicycle implements game{
	public void stop()
	{
		System.out.println("bicycle is stop");
	}
	public void start()
	{
		System.out.println("bicycle is start");
	}
	public void play()
	{
		System.out.println("bicycle is play");
	}
}

public class two_wheelers {

	public static void main(String[] args) {
		game arr[] = new game[10];
int min =1;
int max =4;
int random;
for(int i=0;i<10;i++)
{
	random = ((int) (Math.random()*(max - min))) + min;
if(random == 1)
{
	arr[i] = new car();
}
if(random == 2)
{
	arr[i] = new bike();
}
if(random == 3)
{
	arr[i] = new bicycle();
}
}
for(game ar : arr)
{
	ar.stop();
}
	}

}
