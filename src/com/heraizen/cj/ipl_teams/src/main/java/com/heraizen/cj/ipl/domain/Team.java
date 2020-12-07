package com.heraizen.cj.ipl.domain;

import java.util.List;
public class Team {

		private String name;
		private String coach;
		private String city;
		private String home;
		private String label;
		private List<Player> players;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCoach() {
			return coach;
		}
		public void setCoach(String coach) {
			this.coach = coach;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString() {
			return "Team [name=" + name + ", coach=" + coach + ", city=" + city + ", home=" + home + ", label=" + label
					+ ", players=" + players + "]";
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public List<Player> getPlayers() {
			return players;
		}
		public void setPlayers(List<Player> players) {
			this.players = players;
		}
		public String getHome() {
			return home;
		}
		public void setHome(String home) {
			this.home = home;
		}

	}


