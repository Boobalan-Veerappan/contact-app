package com.heraizen.cj.ipl.service;
import com.heraizen.cj.ipl.Dto.*;
import java.util.List;
import java.util.Map;

import com.heraizen.cj.ipl.Dto.PlayerDTO;
import com.heraizen.cj.ipl.Dto.TeamLabelsDTO;
import com.heraizen.cj.ipl.Dto.PlayerCountDTO;
import com.heraizen.cj.ipl.Dto.RolesAmountDTO;
import com.heraizen.cj.ipl.domain.Roles;

public interface IplStatService {
		public TeamLabelsDTO getTeamLables();
		public List<PlayerDTO> getPlayersByLabel(String label);
		public List<PlayerCountDTO> getRolesCountByLabel(String label);
		public List<PlayerDTO> getPlayersByLabelAndRoles(String label,Roles role);
		public List<RolesAmountDTO> getAmountSpentbyTeam(String label);
		public List<RolesAmountDTO> getAmountSpentOnRoleByLabel(String label);
		public Map<Roles,List<PlayerDTO>> getMaximumPaidPlayerForEachRoles();
		public List<PlayerDTO> getAllPlayer();
		public List<TeamDTO> getTeamDetails();
		
}
