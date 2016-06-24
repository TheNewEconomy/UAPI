package com.creatorfromhell.core.uapi.entity.living.player;

import java.net.InetAddress;

/*
 * TODO: Inventories & items.
 * TODO: Chat
 * TODO: Sound support.
 * TODO: Experience.
 */
public class Player extends HumanEntity {
	
	private InetAddress address;
	private String displayName;
	private float saturation;
	private int food;
	private boolean flightAllowed;
	private boolean flying;
	
	public InetAddress getAddress() {
		return address;
	}
	
	public void setAddress(InetAddress address) {
		if(this.address == null) {
			this.address = address;
		}
	}
	
	public String getHostName() {
		return address.getHostAddress();
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public float getSaturation() {
		return saturation;
	}
	
	public void setSaturation(float saturation) {
		this.saturation = saturation;
	}
	
	public int getFood() {
		return food;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
	
	public boolean isFlightAllowed() {
		return flightAllowed;
	}
	
	public void setFlightAllowed(boolean flightAllowed) {
		this.flightAllowed = flightAllowed;
	}
	
	public boolean isFlying() {
		return flying;
	}
	
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
}