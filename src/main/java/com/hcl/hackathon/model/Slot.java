package com.hcl.hackathon.model;

import java.util.Arrays;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Slot {
	private static  String[] names = {"A","B","C","D"};
	private String name;
	private int slotNumber;
	private boolean availability;
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public Slot(String name, int slotNumber, boolean availability) {
		super();
		this.name = name;
		this.slotNumber = slotNumber;
		this.availability = availability;
	}

	private  static  Multimap<String, Integer> slotsMap = ArrayListMultimap.create();
	public static Multimap<String, Integer> setMultimap(){
		Arrays.asList(names).stream().forEach(s -> {
			for(int i =0; i< 10;i++) {
				slotsMap.put(s, new Integer(i));
			}	
		});
		return slotsMap;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	public static Multimap<String, Integer> getSlotsMap() {
		return slotsMap;
	}
	public static void setSlotsMap() {
		setMultimap();
	}
	

}
