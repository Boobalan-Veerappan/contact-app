package com.heraizen.cj.ipl.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamDTO {

	String city;
	String name;
	String coach;
	String homeGround;
	String label;
	
	
}
