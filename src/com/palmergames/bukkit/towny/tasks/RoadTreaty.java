package com.palmergames.bukkit.towny.tasks;

import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.Translation;
import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.TownyMessaging;
import com.palmergames.bukkit.towny.confirmations.Confirmation;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;

/**
 * Road confirmation and validation thread
 * This should only be used if the towns don't have an road treaty.
 * Use {@link Town#hasRoadTreatyWith(Town)} or {@link TownyUniverse#hasRoadTreaty(Town1, Town2)} for checking.
 * @author GNosii
 */
public class RoadTreaty extends Thread {
	private Town town1;
	private Town town2;
	
	public RoadTreaty(Town first, Town second) {
		super();
		this.town1 = first;
		this.town2 = second;
	}
	
	@Override
	public void run() {
		if (canStartRoadCreation()) {
			Confirmation.runOnAccept(() -> {
				TownyMessaging.sendMsg(town1.getMayor(), Translation.of("msg_road_accepted", town2.getName()));
			
			}).runOnCancel(() -> {
				TownyMessaging.sendMsg(town1.getMayor(), Translation.of("msg_road_error_rejected"));
				return;
			})
			.setTitle(Translation.of("msg_confirmation_road", town1.getName()))
			.setDuration(90)
			.sendTo(town2.getMayor().getPlayer());
		} else {
			TownyMessaging.sendMsg(town1.getMayor(), Translation.of("msg_road_error_enemy"));
		}
	}
	
	/**
	 * Checks if an road can be created between those towns, takes into account these factors:
	 * - Mayor of the other town is online
	 * - Nation relationship (enemys)
	 * @return boolean depending on the result of the check
	 * @throws NotRegisteredException ignored exception
	 */
	private boolean canStartRoadCreation() {
		if (town2.getMayor().getPlayer().isOnline()) {
			if (town1.hasNation() && town2.hasNation()) {
				Nation nation1 = null;
				Nation nation2 = null;
				try {
					nation1 = town1.getNation();
					nation2 = town2.getNation();
				} catch (NotRegisteredException ignored) {};
				return !(nation1.hasEnemy(nation2));
			} else 
				return true;
		} else 
			TownyMessaging.sendMsg(town1.getMayor(), Translation.of("msg_road_error_offline"));
			return false;
	}
}