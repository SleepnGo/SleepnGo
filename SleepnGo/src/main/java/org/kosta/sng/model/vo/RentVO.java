package org.kosta.sng.model.vo;

public class RentVO {
	private int reservNo;
	private String reservDate;
	private int state;
	private RoomVO rvo;
	private MemberVO mvo;
	public RentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RentVO(int reservNo, String reservDate, int state, RoomVO rvo, MemberVO mvo) {
		super();
		this.reservNo = reservNo;
		this.reservDate = reservDate;
		this.state = state;
		this.rvo = rvo;
		this.mvo = mvo;
	}
	public int getReservNo() {
		return reservNo;
	}
	public void setReservNo(int reservNo) {
		this.reservNo = reservNo;
	}
	public String getReservDate() {
		return reservDate;
	}
	public void setReservDate(String reservDate) {
		this.reservDate = reservDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public RoomVO getRvo() {
		return rvo;
	}
	public void setRvo(RoomVO rvo) {
		this.rvo = rvo;
	}
	public MemberVO getMvo() {
		return mvo;
	}
	public void setMvo(MemberVO mvo) {
		this.mvo = mvo;
	}
	@Override
	public String toString() {
		return "RentVO [reservNo=" + reservNo + ", reservDate=" + reservDate + ", state=" + state + ", rvo=" + rvo
				+ ", mvo=" + mvo + "]";
	}
}
