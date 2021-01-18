package com.palmergames.bukkit.towny.object.jail;

public enum JailReason {

	MAYOR("Jailed by mayor.", 1),
	OUTLAW_DEATH("Killed as an outlaw.", 1),
	PRISONER_OF_WAR("Prisoner of War.", 99);
	
	private final String cause;
	private final int hours;
	JailReason(String cause, int hours) {
		this.cause = cause;
		this.hours = hours;
	}
	public String getCause() {
		return cause;
	}
	public int getHours() {
		return hours;
	}
}
