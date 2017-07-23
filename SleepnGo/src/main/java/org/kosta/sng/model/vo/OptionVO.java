package org.kosta.sng.model.vo;

public class OptionVO {
	private String elevator;
	private String wifi;
	private String parkingLot;
	private String kitchen;
	private String pet;
	private String tv;
	private String washer;
	private String smoking;
	private RoomVO rvo;
	public OptionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OptionVO(String elevator, String wifi, String parkingLot, String kitchen, String pet, String tv,
			String washer, String smoking, RoomVO rvo) {
		super();
		this.elevator = elevator;
		this.wifi = wifi;
		this.parkingLot = parkingLot;
		this.kitchen = kitchen;
		this.pet = pet;
		this.tv = tv;
		this.washer = washer;
		this.smoking = smoking;
		this.rvo = rvo;
	}
	public String getElevator() {
		return elevator;
	}
	public void setElevator(String elevator) {
		this.elevator = elevator;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(String parkingLot) {
		this.parkingLot = parkingLot;
	}
	public String getKitchen() {
		return kitchen;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}
	public String getWasher() {
		return washer;
	}
	public void setWasher(String washer) {
		this.washer = washer;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public RoomVO getRvo() {
		return rvo;
	}
	public void setRvo(RoomVO rvo) {
		this.rvo = rvo;
	}
	@Override
	public String toString() {
		return "OptionVO [elevator=" + elevator + ", wifi=" + wifi + ", parkingLot=" + parkingLot + ", kitchen="
				+ kitchen + ", pet=" + pet + ", tv=" + tv + ", washer=" + washer + ", smoking=" + smoking + ", rvo="
				+ rvo + "]";
	}
}
