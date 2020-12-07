package com.heraizen.cj.ipl.Dto;

import com.heraizen.cj.ipl.domain.Roles;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlayerCountDTO {

	String label;
	int count;
	Roles role;
	
}
