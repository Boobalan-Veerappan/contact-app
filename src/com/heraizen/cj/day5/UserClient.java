package com.heraizen.cj.day5;

public class UserClient {

	public static void main(String[] args) {

UserList u = new UserList(new String[] {"indian","captian","is","a","finisher"});

while(u.hasNext())
{
	System.out.println(u.next());
}


	}

}
class UserList implements Mylterator {
	private String name[] = null;
	int i=0;
	public boolean hasNext()
	{
		if(i!= name.length)
		{
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String next() {

		String str = name[i];
		i++;
		return str;
	}
	UserList(String arr[])
	{
		this.name = arr;
	}
}
