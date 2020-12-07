package com.heraizen.cj.main;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.heraizen.cj.ipl.Dto.PlayerCountDTO;
import com.heraizen.cj.ipl.Dto.PlayerDTO;
import com.heraizen.cj.ipl.Dto.RolesAmountDTO;
import com.heraizen.cj.ipl.Dto.TeamDTO;
import com.heraizen.cj.ipl.Dto.TeamLabelsDTO;
import com.heraizen.cj.ipl.domain.Roles;
import com.heraizen.cj.ipl.service.IplStatServiceImplement;
import com.heraizen.cj.ipl.utilreader.JsonReaderUtil;

public class IplManager {

	public static void main(String[] args) {
	
		IplStatServiceImplement ipl = IplStatServiceImplement.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean m=true;
		
		while(m)
		{
			System.out.println("1-getLabel 2-getPlayerbyLabel 3-getroleCountbylabel 4-getPlayersByLabelAndRoles 5-getAmountSpentbyTeam 6-getAmountSpentOnRoleByLabel 7-getMaximumPaidPlayerForEachRoles 8-getAllPlayer 9-getTeamDetails");
			int n = getchoice();
			switch(n)
			{
			case 1:{
				TeamLabelsDTO label = ipl.getTeamLables();
				
				System.out.println(label.getLabels());
				
				break;
			}
			case 2:{
				System.out.println("Enter the valid team label");
				
				String searchlabel = sc.next(); 
				
				List<PlayerDTO> teamlabel = ipl.getPlayersByLabel(searchlabel);
				if(!teamlabel.isEmpty()) {
				
				teamlabel.forEach(e->{
				
				System.out.printf("Player : %-30s Price : %-30s Role : %-10s \n",e.getName(),e.getLabel(),e.getRole().getRoles());
				
			});
				}
				break;
			}
			case 3:{
				System.out.println("Enter the valid team label");
				String searchlabel = sc.next();
				List<PlayerCountDTO> rolecount = ipl.getRolesCountByLabel(searchlabel);
				
				if(!rolecount.isEmpty()) {
						rolecount.forEach(e->{
							
							System.out.println("Count : "+e.getCount()+"   Label : "+e.getLabel()+"   Roles : "+e.getRole().getRoles());
						
						});	
				}
				break;
			}
			case 4:{
				
				System.out.println("Enter the valid label");
				String label = sc.next();
				System.out.println("Enter the valid roles");
				String rolestype = sc.next();
				
				Roles r = Roles.builder().roles(rolestype).build();
				List<PlayerDTO> labelandroles = ipl.getPlayersByLabelAndRoles(label,r);
				if(!labelandroles.isEmpty()) {
				labelandroles.forEach(e->{
					System.out.printf("Roles : %-10s  Name : %-30s Price : %-30f label : %-10s \n",e.getRole().getRoles(),e.getName(),e.getPrice(),e.getLabel());
				});
				}
				break;
			}
			case 5:{
				
				System.out.println("Enter the valid label");
				String label = sc.next(); 
				
				List<RolesAmountDTO> amountspentbyteam = ipl.getAmountSpentbyTeam(label);
				
				if(!amountspentbyteam.isEmpty()) {
				amountspentbyteam.forEach(e->{
					
					System.out.printf("Roles : %-20s , Price : %-20f\n",e.getRole().getRoles(),e.getAmount() );
					
				});
				}
				break;
			}
			case 6:{
				System.out.println("Enter the valid label");
				String label = sc.next();
				List<RolesAmountDTO> AmountSpentOnRoleByLabel = ipl.getAmountSpentOnRoleByLabel(label);
				if(!AmountSpentOnRoleByLabel.isEmpty())
				{
				AmountSpentOnRoleByLabel.forEach(e->{
					System.out.printf("Roles : %-30s Amount : %-30s  ",e.getRole().getRoles(),e.getAmount());
				});
				}
				break;
			}
			case 7:{
				
				ipl.getMaximumPaidPlayerForEachRoles();
				
				break;
			}
			case 8:{
			
				List<PlayerDTO> allPlayers = ipl.getAllPlayer();
				allPlayers.forEach(e->{
					System.out.printf("Name : %-30s Label : %-10s Price : %-20f Role : %-30s \n",e.getName(),e.getLabel(),e.getPrice(),e.getRole().getRoles());		
				});
				
				break;
			}
			case 9:{
				System.out.println("Team Details here");
				
				List<TeamDTO> teamdetails = ipl.getTeamDetails();
				
				teamdetails.forEach(e->{
					System.out.printf("Label : %-10s Name : %-30s City : %-30s Ground : %-40s Coach : %-30s\n",e.getLabel(),e.getName(),e.getCity(),e.getHomeGround(),e.getCoach());
				});
				
				break;
			}
			case 10:{
				m = false;
				System.out.println("Program has Closed");
			}
			}
			
			
		}
		
	}
public static int getchoice()
{
	Scanner sc = new Scanner(System.in);
	int n =0;
	try {
		 n = sc.nextInt(); 
		 if(n>9||n<0)
		 {
			 throw new Exception();
		 }
	}
	catch(InputMismatchException e)
	{
	System.out.println(e);	
	n=0;
	}
	catch(Exception e)
	{
		System.out.println("Please Enter the value between 1 to 9");
	    n=0;
	}
	
	return n;
}
}
