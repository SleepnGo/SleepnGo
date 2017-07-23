package org.kosta.sng.model.vo;

public class RoomVO {
	private int roomNo;
	private int fee;
	private String pic;
	private String latitude;
	private String longitude;
	private int capacity;
	private int bedNo;
	private int bath;
	private int bedRoomNo;
	private String content;
	private String roomName;
	private MemberVO mvo;
	public RoomVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomVO(int roomNo, int fee, String pic, String latitude, String longitude, int capacity, int bedNo, int bath,
			int bedRoomNo, String content, String roomName, MemberVO mvo) {
		super();
		this.roomNo = roomNo;
		this.fee = fee;
		this.pic = pic;
		this.latitude = latitude;
		this.longitude = longitude;
		this.capacity = capacity;
		this.bedNo = bedNo;
		this.bath = bath;
		this.bedRoomNo = bedRoomNo;
		this.content = content;
		this.roomName = roomName;
		this.mvo = mvo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getBedNo() {
		return bedNo;
	}
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	public int getBath() {
		return bath;
	}
	public void setBath(int bath) {
		this.bath = bath;
	}
	public int getBedRoomNo() {
		return bedRoomNo;
	}
	public void setBedRoomNo(int bedRoomNo) {
		this.bedRoomNo = bedRoomNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public MemberVO getMvo() {
		return mvo;
	}
	public void setMvo(MemberVO mvo) {
		this.mvo = mvo;
	}
	@Override
	public String toString() {
		return "RoomVO [roomNo=" + roomNo + ", fee=" + fee + ", pic=" + pic + ", latitude=" + latitude + ", longitude="
				+ longitude + ", capacity=" + capacity + ", bedNo=" + bedNo + ", bath=" + bath + ", bedRoomNo="
				+ bedRoomNo + ", content=" + content + ", roomName=" + roomName + ", mvo=" + mvo + "]";
	}
}
