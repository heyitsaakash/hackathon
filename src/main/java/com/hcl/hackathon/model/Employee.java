package com.hcl.hackathon.model;

import java.time.LocalDateTime;

public class Employee {
	private String empName;
	private String band;
	private int bandLevel;
	private Long contactNo;
	private Long sapId;
	private ParkingLot parkingLot;
	private boolean waitingFor;
	private LocalDateTime appliedTime;
	public boolean isWaitingFor() {
		return waitingFor;
	}
	public void setWaitingFor(boolean waitingFor) {
		this.waitingFor = waitingFor;
	}
	public LocalDateTime getAppliedTime() {
		return appliedTime;
	}
	public void setAppliedTime(LocalDateTime appliedTime) {
		this.appliedTime = appliedTime;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getBandLevel() {
		return bandLevel;
	}
	public void setBandLevel(int bandLevel) {
		this.bandLevel = bandLevel;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public Long getSapId() {
		return sapId;
	}
	public void setSapId(Long sapId) {
		this.sapId = sapId;
	}
	public ParkingLot getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	
}
