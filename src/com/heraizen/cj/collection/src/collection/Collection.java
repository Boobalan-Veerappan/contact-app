package collection;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> list = new ArrayList();
for(int i=0;i<=10;i++)
{
	list.add(ThreadLocalRandom.current().nextInt(1, 100));
}
System.out.print("Before Sorting Order "+list);
list.sort(new Comparator<Integer>(){
@Override
	public int compare(Integer o1,Integer o2) {
		System.out.println(o1+" "+o2);
		return o1;
	}
});
System.out.print("After Sorting Order "+list);
	}
	

}
