package com.heraizen.cj.ipl.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.stream.Collectors;

import com.heraizen.cj.ipl.Dto.PlayerDTO;
import com.heraizen.cj.ipl.Dto.TeamLabelsDTO;
import com.heraizen.cj.ipl.Dto.PlayerCountDTO;
import com.heraizen.cj.ipl.Dto.RolesAmountDTO;
import com.heraizen.cj.ipl.Dto.TeamDTO;
import com.heraizen.cj.ipl.domain.Player;
import com.heraizen.cj.ipl.domain.Roles;
import com.heraizen.cj.ipl.domain.Team;
import com.heraizen.cj.ipl.utilreader.JsonReaderUtil;

public class IplStatServiceImplement implements IplStatService {
	Team t = new Team();
	List<Team> teamList = new ArrayList<Team>();
	String playersRoles[] = { "Batsman", "Wicket Keeper", "All-Rounder", "Bowler" };
	double batsman = 0;
	double wkeeper = 0;
	double allrounder = 0;
	double bowler = 0;
	Roles batmanrole = Roles.builder().roles("Batsman").build();
	Roles wkeeeperoles = Roles.builder().roles("Wicket Keeper").build();
	Roles allrounderrole = Roles.builder().roles("All-Rounder").build();
	Roles bowlerrole = Roles.builder().roles("Bowler").build();
	List<PlayerDTO> bat1 = new ArrayList<PlayerDTO>();
	List<PlayerDTO> wckeeper = new ArrayList<PlayerDTO>();
	List<PlayerDTO> allrounders = new ArrayList<PlayerDTO>();
	List<PlayerDTO> bowlers = new ArrayList<PlayerDTO>();
	private IplStatServiceImplement() {
		teamList = JsonReaderUtil.readDataFromFile();
		
	}

	public static IplStatServiceImplement getInstance() {
		return new IplStatServiceImplement();
	}

	@Override
	public TeamLabelsDTO getTeamLables() {

		List<String> teamlabels = new ArrayList<String>();

		teamList.stream().forEach(e -> {

			teamlabels.add(e.getLabel());
		});

		TeamLabelsDTO label = TeamLabelsDTO.builder().labels(teamlabels).build();

		return label;
	}

	@Override
	public List<PlayerDTO> getPlayersByLabel(String label) {

		
		
		List<PlayerDTO> player = new ArrayList<PlayerDTO>();
		if(teamList.stream().anyMatch(e->e.getLabel().equalsIgnoreCase(label)))
		{
		teamList.stream().forEach(e -> {

			if (e.getLabel().equalsIgnoreCase(label)) {
				t = e;
			}
		});

		t.getPlayers().stream().forEach(e -> {

			Roles r = Roles.builder().roles(e.getRole()).build();

			PlayerDTO p = PlayerDTO.builder().name(e.getName()).price(e.getPrice()).role(r).label(t.getLabel()).build();

			player.add(p);

		});
		}
		else {
			System.out.println("Please Enter Valid Labels");
		}
		
		return player;
	}

	@Override
	public List<PlayerCountDTO> getRolesCountByLabel(String label) {

		List<PlayerCountDTO> rolesCount = new ArrayList<PlayerCountDTO>();
		if(teamList.stream().anyMatch(e->e.getLabel().equalsIgnoreCase(label)))
		{
		for (String role : playersRoles) {
			rolesCount.add(
					PlayerCountDTO.builder().role(Roles.builder().roles(role).build()).count(0).label(null).build());
		}

		teamList.forEach(e -> {

			if (e.getLabel().equalsIgnoreCase(label)) {
				e.getPlayers().forEach(e1 -> {
					if (e1.getRole().equalsIgnoreCase("Batsman")) {
						rolesCount.get(0).setLabel(e.getLabel());
						rolesCount.get(0).setCount(1 + rolesCount.get(0).getCount());
					} else if (e1.getRole().equalsIgnoreCase("Wicket Keeper")) {
						rolesCount.get(1).setLabel(e.getLabel());
						rolesCount.get(1).setCount(1 + rolesCount.get(1).getCount());
					} else if (e1.getRole().equalsIgnoreCase("All-Rounder")) {
						rolesCount.get(2).setLabel(e.getLabel());
						rolesCount.get(2).setCount(1 + rolesCount.get(2).getCount());

					} else if (e1.getRole().equalsIgnoreCase("Bowler")) {
						rolesCount.get(3).setLabel(e.getLabel());
						rolesCount.get(3).setCount(1 + rolesCount.get(3).getCount());
					}
				});
			}

		});
		}
		else {
			System.out.println("Please Enter the Valid Labels");
		}
//		customers.stream() 
//        .filter(c -> c.getTrack() != null)
//        .map(c -> c.getTrack().getId())
//        .flatMap(id -> tracks.stream().filter(track -> Long.valueOf(track.getId()).equals(id)))
//        .collect(Collectors.toSet());
		
		
		
		return rolesCount;
	}

	@Override
	public List<PlayerDTO> getPlayersByLabelAndRoles(String label, Roles role) {

		List<PlayerDTO> playersbylabelandrole = new ArrayList<PlayerDTO>();
		
		if(teamList.stream().anyMatch(e->e.getLabel().equalsIgnoreCase(label)))
		{
		teamList.forEach(e -> {
			if (e.getLabel().equalsIgnoreCase(label)) {
				
				System.out.println(e.getPlayers().stream().anyMatch(m->m.getRole().equalsIgnoreCase(role.getRoles())));
				
				if(e.getPlayers().stream().anyMatch(m->m.getRole().equalsIgnoreCase(role.getRoles()))) {
				e.getPlayers().forEach(e1 -> {

					if (e1.getRole().equalsIgnoreCase(role.getRoles())) {

						PlayerDTO player = PlayerDTO.builder().label(e.getLabel()).price(e1.getPrice()).role(role)
								.name(e1.getName()).build();
						playersbylabelandrole.add(player);
					}

				});
				}
				else {
					System.out.println("Please Enter the Valid Roles");
				}
			
			}

		});
		
		}
		else {
			System.out.println("Please Type Valid Label");
		}
		

		

		return playersbylabelandrole;
	}

	@Override
	public List<RolesAmountDTO> getAmountSpentbyTeam(String label) {

		List<RolesAmountDTO> amountspentbyteam = new ArrayList<RolesAmountDTO>();

		
		if(teamList.stream().anyMatch(e->e.getLabel().equalsIgnoreCase(label)))
		{
		
		for (String role : playersRoles) {

			amountspentbyteam.add(RolesAmountDTO.builder().role(Roles.builder().roles(role).build()).amount(0).build());

		}

		teamList.forEach(e -> {
			if (e.getLabel().equalsIgnoreCase(label)) {
				e.getPlayers().forEach(e1 -> {

					if (e1.getRole().equalsIgnoreCase(playersRoles[0])) {
						batsman = amountspentbyteam.get(0).getAmount();

						amountspentbyteam.get(0).setAmount(batsman + e1.getPrice());
					} else if (e1.getRole().equalsIgnoreCase(playersRoles[1])) {
						wkeeper = amountspentbyteam.get(1).getAmount();
						amountspentbyteam.get(1).setAmount(wkeeper + e1.getPrice());
					} else if (e1.getRole().equalsIgnoreCase(playersRoles[2])) {
						allrounder = amountspentbyteam.get(2).getAmount();
						amountspentbyteam.get(2).setAmount(allrounder + e1.getPrice());
					} else if (e1.getRole().equalsIgnoreCase(playersRoles[3])) {
						bowler = amountspentbyteam.get(3).getAmount();
						amountspentbyteam.get(3).setAmount(bowler + e1.getPrice());
					}

				});
			}

		});
		}
		else {
			System.out.println("Please Enter Valid Labels");
		}
		return amountspentbyteam;
	}

	@Override
	public List<RolesAmountDTO> getAmountSpentOnRoleByLabel(String label) {

		List<RolesAmountDTO> roleamount = new ArrayList<RolesAmountDTO>();
		if(teamList.stream().anyMatch(e->e.getLabel().equalsIgnoreCase(label)))
		{
		teamList.forEach(e -> {
			if (e.getLabel().equalsIgnoreCase(label)) {
				e.getPlayers().forEach(e1 -> {
					Roles r = Roles.builder().roles(e1.getRole()).build();
					RolesAmountDTO role = RolesAmountDTO.builder().amount(e1.getPrice()).role(r).build();
					roleamount.add(role);
				});
			}
		});
		}
		else {
			System.out.println("Please Enter the Valid Labels");
		}
		return roleamount;
	}

	@Override
	public Map<Roles, List<PlayerDTO>> getMaximumPaidPlayerForEachRoles() {

		Map<Roles, List<PlayerDTO>> maxpaidplayer = new HashMap<Roles, List<PlayerDTO>>();
		
		maxpaidplayer.put(batmanrole, bat1);
		maxpaidplayer.put(wkeeeperoles, wckeeper);
		maxpaidplayer.put(allrounderrole, allrounders);
		maxpaidplayer.put(bowlerrole, bowlers);

		teamList.stream().forEach(e -> {
			e.getPlayers().forEach(e1 -> {
				if (e1.getRole().equalsIgnoreCase(playersRoles[0])) {
					bat1.add(PlayerDTO.builder().label(e.getLabel()).name(e1.getName()).price(e1.getPrice())
							.role(batmanrole).build());
					maxpaidplayer.put(batmanrole, bat1);
				} else if (e1.getRole().equalsIgnoreCase(playersRoles[1])) {
					wckeeper.add(PlayerDTO.builder().label(e.getLabel()).name(e1.getName()).price(e1.getPrice())
							.role(wkeeeperoles).build());
					maxpaidplayer.put(wkeeeperoles, wckeeper);
				} else if (e1.getRole().equalsIgnoreCase(playersRoles[2])) {
					allrounders.add(PlayerDTO.builder().label(e.getLabel()).name(e1.getName()).price(e1.getPrice())
							.role(allrounderrole).build());
					maxpaidplayer.put(allrounderrole, allrounders);
				} else if (e1.getRole().equalsIgnoreCase(playersRoles[3])) {
					bowlers.add(PlayerDTO.builder().label(e.getLabel()).name(e1.getName()).price(e1.getPrice())
							.role(bowlerrole).build());
					maxpaidplayer.put(bowlerrole, bowlers);
				}

			});

		});
		

		
		bat1 = bat1.stream().sorted(Comparator.comparingDouble(PlayerDTO::getPrice).reversed()).collect(Collectors.toList());
		wckeeper = wckeeper.stream().sorted(Comparator.comparingDouble(PlayerDTO::getPrice).reversed()).collect(Collectors.toList());
		allrounders = allrounders.stream().sorted(Comparator.comparingDouble(PlayerDTO::getPrice).reversed()).collect(Collectors.toList());
		bowlers = bowlers.stream().sorted(Comparator.comparingDouble(PlayerDTO::getPrice).reversed()).collect(Collectors.toList());
		maxpaidplayer.put(batmanrole, bat1);
		maxpaidplayer.put(wkeeeperoles, wckeeper);
		maxpaidplayer.put(allrounderrole, allrounders);
		maxpaidplayer.put(bowlerrole, bowlers);
		for (Roles r : maxpaidplayer.keySet()) {
			System.out.println("Roles : "+r.getRoles());
			System.out.println("<------------------------------ "+r.getRoles()+" --------------------------------->");
			maxpaidplayer.get(r).forEach(e -> {
				System.out.printf("%10s\n",e.getName());
			});
			System.out.println();
		}

		return null;
	}

	@Override
	public List<PlayerDTO> getAllPlayer() {
		List<PlayerDTO> playersList = new ArrayList<PlayerDTO>();

		teamList.forEach(e -> {

			e.getPlayers().forEach(e1 -> {
				Roles r = Roles.builder().roles(e1.getRole()).build();
				PlayerDTO player = PlayerDTO.builder().name(e1.getName()).price(e1.getPrice()).role(r)
						.label(e.getLabel()).build();

				playersList.add(player);

			});

		});

		return playersList;
	}

	@Override
	public List<TeamDTO> getTeamDetails() {
		List<TeamDTO> teamdetails = new ArrayList<TeamDTO>();

		teamList.stream().forEach(e -> {
			TeamDTO detail = TeamDTO.builder().coach(e.getCoach()).label(e.getLabel()).name(e.getName())
					.homeGround(e.getHome()).city(e.getCity()).build();
			teamdetails.add(detail);
		});

		return teamdetails;
	}

}
