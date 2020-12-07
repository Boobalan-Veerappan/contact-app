package com.heraizen.cj.ipl.utilreader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heraizen.cj.ipl.domain.Team;

public class JsonReaderUtil {
	private JsonReaderUtil() {
	}

	public static List<Team> readDataFromFile() {
		List<Team> teamLists = new ArrayList<>();
		final ObjectMapper objectMapper = new ObjectMapper();
		try {
			teamLists = objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream("/details.json"), new TypeReference<List<Team>>() {
				
			});
			
			
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JacksonException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return teamLists;
	}
}
