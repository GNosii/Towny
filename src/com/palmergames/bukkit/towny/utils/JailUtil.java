package com.palmergames.bukkit.towny.utils;

import org.bukkit.Bukkit;

import com.palmergames.bukkit.towny.TownyMessaging;
import com.palmergames.bukkit.towny.event.resident.ResidentUnjailEvent;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.Translation;
import com.palmergames.bukkit.towny.object.jail.Jail;
import com.palmergames.bukkit.towny.object.jail.JailReason;
import com.palmergames.bukkit.towny.object.jail.UnJailReason;

public class JailUtil {

	
	public static void jailResident(Resident resident, Town town, Jail jail, int hours, JailReason reason) {
		
	}
	
	public static void unJailResident(Resident resident, UnJailReason reason) {
		
		Jail jail = resident.getJail();
		String jailNumber = "Placeholder";
		switch (reason) {
		case ESCAPE:
			Town town = null;
			try {
				town = resident.getTown();
			} catch (NotRegisteredException ignored) {}
			
			// First show a message to the resident, either by broadcasting to the resident's town or just the resident (if they have no town.)
			if (town != null)
				TownyMessaging.sendPrefixedTownMessage(town, Translation.of("msg_player_escaped_jail_into_wilderness", resident.getName(), jail.getTownBlock().getWorld().getUnclaimedZoneName()));
			else 
				TownyMessaging.sendMsg(resident, Translation.of("msg_you_have_been_freed_from_jail"));
			
			// Second, show a message to the town which has just had a prisoner escape.
			if (!resident.hasTown() || (town != null && !town.equals(jail.getTown())))
				TownyMessaging.sendPrefixedTownMessage(jail.getTown(), Translation.of("msg_player_escaped_jail_into_wilderness", resident.getName(), jail.getTownBlock().getWorld().getUnclaimedZoneName()));
			break;

		case BAIL:
			break;
		case PARDONED:
			TownyMessaging.sendMsg(resident, Translation.of("msg_you_have_been_freed_from_jail"));
			TownyMessaging.sendPrefixedTownMessage(jail.getTown(), Translation.of("msg_player_has_been_freed_from_jail_number", resident.getName(), jailNumber));
			break;
		case SENTENCE_SERVED:
			break;
		case LEFT_TOWN:
			break;
		case JAIL_DELETED:
			break;
		}

		resident.setJailed(false);

		
		resident.save();
		Bukkit.getPluginManager().callEvent(new ResidentUnjailEvent(resident));
	}
}
