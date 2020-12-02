package com.heraizen.cj.day6.statecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.heraizen.cj.day6.emploeecontainer.Employee;

public class Stateinfo {
Set<String> states = new HashSet<String>();

public void addState(String name){
	states.add(name);
}
public void viewStates(){
	List<String> view = states.stream().sorted().collect(Collectors.toList());
	Collections.reverse(view);
	System.out.println(view);
}

}
