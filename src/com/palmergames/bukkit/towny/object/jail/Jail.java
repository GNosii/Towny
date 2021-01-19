package com.palmergames.bukkit.towny.object.jail;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.TownBlock;
import com.palmergames.bukkit.towny.TownyUniverse;

public class Jail {

	private UUID uuid;
	private Town town;
	private TownBlock townBlock;
	private List<Location> jailSpawns;
	public Jail(UUID uuid, Town town, TownBlock townBlock, List<Location> jailSpawns) {
		this.uuid = uuid;
		this.town = town;
		this.townBlock = townBlock;
		this.jailSpawns = jailSpawns;
	}

	public UUID getUUID() {
		return uuid;
	}

	public void setUUID(UUID uuid) {
		this.uuid = uuid;
	}

	public Town getTown() {
		return town;
	}
	
	public void setTown(Town town) {
		this.town = town;
	}

	public TownBlock getTownBlock() {
		return townBlock;
	}

	public void setTownBlock(TownBlock townBlock) {
		this.townBlock = townBlock;
	}

	public List<Location> getJailSpawns() {
		return jailSpawns;
	}

	public void setJailSpawns(List<Location> jailSpawns) {
		this.jailSpawns = jailSpawns;
	}
	
	public void addJailSpawn(Location location) {
		jailSpawns.add(location);
	}
	
	public void removeJailSpawn(int index) {
		if (index > jailSpawns.size())
			return;
		jailSpawns.remove(--index);
	}
	
	public void save() {
		TownyUniverse.getInstance().getDataSource().saveJail(this);
	}
}
